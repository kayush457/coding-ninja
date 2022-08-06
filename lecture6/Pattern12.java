package lecture6;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while (i <= n) {
			int spaces = 1;
			while(spaces <= n-i) {
				System.out.print(" ");
				spaces++;
			}
			
			int num = 1;
			while (num <= i) {	
				System.out.print(num);
				num++;
			}
			
			int t = i-1;
			while(t>=1) {
				System.out.print(t);
				t--;
			}
			
			System.out.println("");
			i++;
			
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
      121
     12321
    1234321
   123454321
  12345654321
 1234567654321
123456787654321

*/