package hackerrank;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr_size = sc.nextInt();
		int item_not_had = sc.nextInt();
		int total =0, diff=0, a[];
		a = new int[arr_size];
		
		for(int i=0; i < arr_size; i++){
			a[i] = sc.nextInt();
			total = total + a[i];
		}
		
		int total_div = sc.nextInt();
		
		if(total/2 == total_div){
			System.out.println(a[item_not_had]/2);;
		}
		else{
			System.out.println("Bon Appetit");
		}
	}

}
