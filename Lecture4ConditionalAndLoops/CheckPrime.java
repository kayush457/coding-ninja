// use of return in main will end the main.
package Lecture4ConditionalAndLoops;
import java.util.Scanner;
public class CheckPrime {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int div = 2;
		int t = 1;
		boolean isPrime = true;
		while(div <= n - 1){
			if(n % div == 0){
				//System.out.println(div + " " + "Composite");
				isPrime= false;
				break;
			}
			div = div + 1;
			t += 1;
		}
		
		if(isPrime == true){ 	//already a boolean no need to compare
		System.out.println("Prime");
		}else
		System.out.println("Composite");
		
		System.out.println("The loop ran "+ t +" times");
	}

}

/*
 * Alternative use of return
 * 
 * 		{
 * 		int div = 2;
		while(div <= n - 1){
			if(n % div == 0){
				System.out.println("Composite");
				return;
			}
			div = div + 1;
		}
		System.out.println("Prime");
		}
 * 
 */
