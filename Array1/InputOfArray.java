package Array1;
import java.util.Scanner;

public class InputOfArray {
	
	public static int[] takeInput() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++){
			System.out.println("Enter element at " + i + "th index");
			arr[i] = scan.nextInt();
		}
		scan.close();
		return arr;
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = takeInput();
		printArray(arr);
		
	}

}
