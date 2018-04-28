package hackerrank;

import java.util.Scanner;

public class HavingBigSum {

	public static void main(String[] args) {
		int size;
		int a[];
		long sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size = ");
		size = sc.nextInt();
		a = new int[size];
		
		for(int i=0; i<size; i++){
			System.out.println("enter the value of " + i + "= ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
			System.out.println("sum : " + sum);
		}
		System.out.println("sum is: " + sum);
	}
}
