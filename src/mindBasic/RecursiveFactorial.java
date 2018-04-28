package mindBasic;

import java.util.Scanner;
public class RecursiveFactorial {

	public static void main(String[] args) {
		int fact =1;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		fact= factorial(number);
		System.out.println("Factorial of " + number + " is : " + fact);
		sc.close();
	}
		public static int factorial(int number){
			if(number==0){
				return 1;
			}
			else{
				return(number * factorial(number-1));
			}
		}
}
