package Lecture5;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int res =1;
		while (i <= n) {
			res = i;
			int j = 1;
			char p = (char)('A'+i-1);
			while (j <= i) {
				
				System.out.print(p);
				p = (char)(p+1);
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
BC
CDE
DEFG
EFGHI
FGHIJK
GHIJKLM
HIJKLMNO

*/