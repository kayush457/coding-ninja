package Lecture8_FunctionsAndScope;

public class MoreOnFunctions {
	
	public static double sum(int a, int b, double c){
		double ans = a + b + c;
		return ans; // return a +b
		
	}
	
	public static void printEvenNumbers(int start, int end){
		if(start % 2 != 0){
			start++;
		}
		for(int i = start; i <= end; i+=2){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		printEvenNumbers(3,17);
	}
		
		
}
