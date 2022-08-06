package Lecture5;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int res =1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				char ch = (char)('A'+j-1);
				System.out.print(ch);
				res += 1;
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

A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
ABCDEFGH

*/