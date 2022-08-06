package Lecture7_OperatorAndForLoop;

public class BreakKeyword {
	
	public static void main(String args) {
		int n = 5;
		int i = 1;
		while(i < n){
			if(i ==  4){
				break;
// break : The break statement can be used to jump out of a loop.
//				System.out.println(i);  //unreachable code
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("Outside While");

	}
}