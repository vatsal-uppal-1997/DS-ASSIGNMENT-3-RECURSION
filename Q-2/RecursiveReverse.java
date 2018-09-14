import java.util.*;

public class RecursiveReverse {
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static void reverse(int arr[], int start, int end) {
		
		if (start > end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		reverse(arr,++start, --end);
		
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter array size : ");
		int size = sc.nextInt();
		System.out.println();
		int arr[] = new int[size];
		
		for (int i=0;i<size;i++) {
			
			System.out.print("arr["+i+"] = ");
			arr[i] = sc.nextInt();
			System.out.println();
			
		}
		reverse(arr,0,arr.length-1);
		
		System.out.println("Reversed Array : "+Arrays.toString(arr));
		
	}
	
	
}