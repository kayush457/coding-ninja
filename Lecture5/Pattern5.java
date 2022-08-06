package Lecture5;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
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

Input:

8

Output:

1
12
123
1234
12345
123456
1234567
12345678
*/