import java.util.*;

public class RecursiveBrackets {
	
	private static final Scanner sc = new Scanner(System.in);
	private static String open = "({[<";
	private static String close = ")}]>";
	/*
		NOTE 
		
			IF WE HAVE AN INDEX FOR ANY CHARACTER IN THE 'OPEN' STRING WE CAN GET THE CORRESPONDING CLOSING BRACKET FROM 'CLOSE' STRING OR VICE-A-VERSA
			EXAMPLE,
				open.indexOf('{') RETURNS 1
				close.charAt(1) RETURNS '}'
				
				**THIS WILL BE USED BELOW
				
	*/
	private static boolean brackets(String s, int start, int end) {
		
		if (start > end) // If this condition gets satisfied the recursive function had been returning true hence return true
			return true;
		if (end == 1 || close.contains(Character.toString(s.charAt(0)))) // Atleast 2 elements must be present and the first element must not be a closing bracket
			return false;
		String bracket = Character.toString(s.charAt(start)); // Assuming we have a bracket store character converted to string in bracket variable
		
		if (open.contains(bracket)) { // Check that assuming we have an opening bracket we got the corresponding closing bracket 
			int check = open.indexOf(bracket); // See 'NOTE' above
			String bracket_in_close = Character.toString(close.charAt(check)); // See 'NOTE' above
			if (!s.contains(bracket_in_close)) // If there isnt any occurance of the closing bracket for an opening bracket return false
				return false;
		}
		
		if (close.contains(bracket)) {
			int temp = start-1;
			int check = close.indexOf(bracket);
			String bracket_in_string = Character.toString(s.charAt(temp));
			String bracket_in_open = Character.toString(open.charAt(check));
			
			while (!open.contains(bracket_in_string)) { // while dont get an opening bracket keep moving temp back
				temp--;
				bracket_in_string = Character.toString(s.charAt(temp));
			}
			
			//System.out.println(bracket_in_string + " " + bracket_in_open); // for debugging
			if (!bracket_in_string.equals(bracket_in_open)) 
				return false;
			else
				return true;
		} 
		
		return brackets(s,++start,end);
	}
	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("balanced : "+brackets(s,0,s.length()));
	}
	
}