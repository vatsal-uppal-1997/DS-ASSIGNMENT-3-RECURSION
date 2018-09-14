import java.util.*;

public class RecursiveSum {
	
	private static final Scanner sc = new Scanner(System.in);
	private static int sum(String s) {
		if (s.length() == 1)
			return Integer.parseInt(s);
		int sum = 0;
		for (char i: s.toCharArray())
			sum += sum(Character.toString(i));
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		String s = Integer.toString(sc.nextInt());
		System.out.println("Sum of digits : "+sum(s));
	}
	
}