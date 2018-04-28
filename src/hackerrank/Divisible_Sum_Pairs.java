package hackerrank;

import java.util.Scanner;

public class Divisible_Sum_Pairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[];
		int size = sc.nextInt();
		int k= sc.nextInt();
		int count=0;
		
		a = new int[size];
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		for(int j=0; j<a.length; j++){
			for(int p = j+1; p<a.length; p++){
				if((a[j]+a[p]) % k ==0){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
