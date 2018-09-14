import java.util.*;

public class RecursiveSearch {
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static boolean search(int arr[], int m, int start, int end) {
		
		if (arr[start] == m)
			return true;
		else if (start == end)
			return false;
		
		return search(arr,m,++start,end);
		
	}
	
	public static void main(String []args) {
		
		System.out.print("Enter array size : ");
		int size = sc.nextInt();
		System.out.println();
		int arr[] = new int[size];
		for (int i=0;i<size;i++) {
			System.out.print("arr["+i+"] = ");
			arr[i] = sc.nextInt();
			System.out.println();
		}
		
		System.out.print("Check if array contains : ");
		int m = sc.nextInt();
		System.out.println("Array contains "+m+" : "+search(arr,m,0,arr.length-1));
		
	}
	
	
}