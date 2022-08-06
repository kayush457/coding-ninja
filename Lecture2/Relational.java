package Lecture2;
import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		
		boolean isEq = (i == j);
		boolean nEq = (i != j);
		boolean isGr = (i > j);
		boolean isGrEq = (i >= j);
		boolean isLess = (i < j);
		boolean isLessEq = (i <= j);
		 
		 
		System.out.println("Is Equal " + isEq);
		System.out.println("Is Not Equal " + nEq);
		System.out.println("Is Greater " + isGr);
		System.out.println("Is Greater Equal " + isGrEq);
		System.out.println("Is Less " + isLess);
		System.out.println("Is Less Equal " + isLessEq);		
	}
}
