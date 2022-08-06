package Lecture7_OperatorAndForLoop;

public class IncrementDecrement {
	public static void main(String[] args) {
		
		int a = 60, b = 80;
		if(a++ > 60 && b++ > 80) {
			System.out.println("Inside if");
		}
		else {
			System.out.println("Inside else");
		}
		
		System.out.println("a"+ a +" b"+b);
		
		//Shortcircuiting
		
		
	}

}		
		
		
		
//		int a = 60;
//		int b = a++;  // old value of 'a' will be stored in 'b' i.e. 60
//		// value in a = 61
//		
//		int c = ++a;  // new value of 'a' will be stored in 'c'
//		//value in a = 62
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

