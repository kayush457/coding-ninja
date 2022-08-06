package Lecture4ConditionalAndLoops;
import java.util.Scanner;

public class LargestOfTwo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		
		if(a>b) {
			System.out.println("First number is greater");
		}
		else {
			System.out.println("Second number is greater");	
		}
		System.out.println("Outside if else block");
	}
	
}
