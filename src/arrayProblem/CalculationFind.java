package arrayProblem;

import java.util.Scanner;

public class CalculationFind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("size = " + size);
		
		for(int i=0; i<size; i++){
			int k=sc.nextInt();
			System.out.println("k= "+ k);
			a[i]=k;
		}
		
		int target = sc.nextInt();
		System.out.println("target = " + target);
		int high=size;
		int low=0; 
		int mid=low+high/2;
		
		boolean flag=true;
		while(flag){
			if(target < a[mid]){
				high = mid;
			}
			else if(target> a[mid]){
				low = mid;
			}
			else if(target == a[mid]){
				flag = false;
			}
		}
		
		for(int i=0; i<target; i++){
			for(int j=i+1; j<target; j++){
				if(a[i]+a[j]==10){
					System.out.println("a[i] = " + a[i]  + "a[j] = " + a[j]);
				}
			}
		}
	}
}
