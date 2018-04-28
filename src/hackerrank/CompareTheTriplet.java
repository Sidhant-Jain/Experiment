package hackerrank;

import java.io.*;
import java.util.Scanner;


public class CompareTheTriplet {

	public static void main(String[] args) {
		
		int sumOfX = 0;
		int sumOfY = 0;
		Scanner sc = new Scanner(System.in);
		int x[];
		int y[];
		x = new int[3];
		y = new int[3];
		
		for(int i=0; i<3; i++){
			x[i]  = sc.nextInt();
			y[i] = sc.nextInt();
			
			if(x[i]>y[i]){
				sumOfX++;
			}
			else if(x[i]<y[i]){
				sumOfY++;
			}
		}
		
		System.out.println(sumOfX + " " + sumOfY);
	}

}
