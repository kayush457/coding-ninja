package Lecture2;
import java.util.Scanner;
public class SimpleInterestCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Enter principal, rate , time");
		
		
		int p = scan.nextInt(); //long,double,float,and line for string. 
		int r = scan.nextInt();
		int t = scan.nextInt();
		int si = (p*r*t)/100;
		
		System.out.println(si);
		
		String str = scan.next();
		char c = str.charAt(0);
		System.out.println(c);
		
		
	}

}
