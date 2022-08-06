package Lecture5;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int res =1;
		while (i <= n) {
			res = i;
			int j = 1;
			while (j <= i) {
				
				System.out.print(res);
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

4

Output:

1
23
345
4567
*/