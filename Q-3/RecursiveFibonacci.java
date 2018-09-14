import java.util.Scanner;

public class RecursiveFibonacci {
	
	// 0 1 1 2 3 5 8 13....
	// sum = 0 + 1
	// next = sum + 1
	private static final Scanner sc = new Scanner(System.in);
	private static int getFibN(int n) {
		
		if (n < 2)
			return n;
		
		int fib = getFibN(n-1)+getFibN(n-2);

		return fib;
		
	}
	
	public static void main(String[] args) {
		System.out.print("N : ");
		System.out.println(getFibN(sc.nextInt()));
	}
	
}