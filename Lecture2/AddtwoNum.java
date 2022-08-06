package Lecture2;
import java.util.Scanner;

public class AddtwoNum{
	
	public static void main(String[] args) {
		/*
		int  i = 10;
		int j = 15;
		int k = i + j;
		System.out.println(k);
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		scan.close();
		
		int k = i + j;
		System.out.println(k);
	}
}