package Lecture5;

import java.util.Scanner;

public class Pattern3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(j);
				j = j+1;
			}
			System.out.println();
			i = i + 1;
			
		s.close();
		}
	}

}

/*
Example:

Input: 8

Output:

12345678
12345678
12345678
12345678
12345678
12345678
12345678
12345678

*/