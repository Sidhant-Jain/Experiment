package mindBasic;

import java.util.Scanner;

public class BacktrackingFactorial {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = fact(n,n);
		System.out.println(result);
		sc.close();
	}
	
	public static int fact(int n, int temp){
		if(n>1){
			temp=temp*(--n);
			fact(n, temp);
		}
		return temp;
	}
}
