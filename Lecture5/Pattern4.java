package Lecture5;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(n - j + 1);
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

Input:

8

Output:

87654321
87654321
87654321
87654321
87654321
87654321
87654321
87654321

*/