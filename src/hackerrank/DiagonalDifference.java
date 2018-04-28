package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		int a[][];
		int i,j,sum1=0,sum2=0,temp=0,diff=0;
				
		System.out.println("enter ur size: ");
		//temp = sc.nextInt();
		//size = temp-1;
		size = sc.nextInt();
		temp = size;
		a=new int[size][size];		
		for(i=0; i<size; i++){
			temp--;
			for(j=0; j<size; j++){
				System.out.println("print i&j value: " + i+j);
				a[i][j] = sc.nextInt();
				System.out.println("value is: " + i + j + "= " + a[i][j]);
				
				if(i==j){
					sum1=sum1+a[i][j];
				}
				if(temp==j){
					sum2 = sum2 + a[i][j];
				}
			}
			
			
		}
		System.out.println("sum1 is: = " + sum1);
		System.out.println("sum2 is: = " + sum2);
		
		diff = sum1-sum2;
		
		diff = Math.abs(diff);
		System.out.println("diff: " + diff);
	}

}
