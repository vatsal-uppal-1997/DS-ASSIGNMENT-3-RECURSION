import java.util.*;

public class RecursivePower {
	
	private static final Scanner sc = new Scanner(System.in);
	private static int pow(int x, int y) {
		
		if (y == 0)
			return 1;
		else if (y%2 == 0)
			// if power is even we can represent 5^4 as 5^2 * 5^2
			return pow(x,y/2) * pow(x,y/2);
		else
			// if odd power 5^3 as 5 * 5^2
			return x * pow(x,(y-1)/2) * pow(x,(y-1)/2);
		
		
	}
	
	public static void main(String[] args) {
		
		int x,y;
		System.out.print("Enter x : ");
		x = sc.nextInt();
		System.out.println();
		System.out.print("Raise "+x+" to power : ");
		y = sc.nextInt();
		
		System.out.println(x+"^"+y+" = "+pow(x,y));
	}
	
	
}