package challanges;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeroOneSeprationProblem {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
//		ArrayList al = new ArrayList();
		int length =  sc.nextInt();
		int a[] = new int[length];
		
		for(int i=0; i<length; i++){
			int k = sc.nextInt();
//			al.add(k);
			a[i] = k;
		}
		System.out.println(a);
		int count =0,temp;
		for(int i=0; i<a.length; i++){
			int size = a.length;
//			count++;
//			if((a[i] == 0) && a[size-count] == 1){
//				temp = a[size-count];
//				
//			}
			
			for(int j=size-1; j<0; j--){
				
			}
		}
	}
	
}
