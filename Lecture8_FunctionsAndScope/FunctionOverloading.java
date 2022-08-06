package Lecture8_FunctionsAndScope;

public class FunctionOverloading {
	
	public static int sum(int a, int b) {
		return a+ b;
	}
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static int sum(int a) {
		return a+1;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10));
		System.out.println(sum(10, 12));
		System.out.println(sum(10.5, 12));
		
	}

}
