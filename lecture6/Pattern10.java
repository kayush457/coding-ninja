package lecture6;
import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int i = 1;
		while(i <= num) {
			int j = 1;
			while(j <= num - i + 1) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
			scan.close();
		}
		
		

	}

}

/*
Example:

Input:

8

Output:

********
*******
******
*****
****
***
**
*

*/