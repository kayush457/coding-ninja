package lecture6;

import java.util.Scanner;

public class Pattern11 {

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
			
			int stars = 1;
			while (stars <= i) {	
				System.out.print("*");
				stars++;
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

       *
      **
     ***
    ****
   *****
  ******
 *******
********

*/