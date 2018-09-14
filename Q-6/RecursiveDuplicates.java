import java.util.*;

public class RecursiveDuplicates {
	
	private static final Scanner sc = new Scanner(System.in);
	private static String duplicates(String s) {
		if (s.length() == 1)
			return s;
		String temp = "";
		for (char i: s.toCharArray()){
			String x = duplicates(Character.toString(i));
			if (!temp.contains(x))
				temp += x;
		}
		return temp;
	}
	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("new string : "+duplicates(s));
	}
	
}