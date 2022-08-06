package Lecture7_OperatorAndForLoop;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1, n= 5;
		while(i <=n) {
			i++;
			if(i ==4) {
				continue;
				/*
				 * The Java continue statement is used to continue the loop. 
				 * It continues the current flow of the program and skips the 
				 * remaining code at the specified condition. In case of an inner loop, 
				 * it continues the inner loop only.
				 */
			}
			System.out.println(i);
		}

	}

}
