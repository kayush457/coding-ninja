package Lecture5;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(i);
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

11111111
22222222
33333333
44444444
55555555
66666666
77777777
88888888

*/
