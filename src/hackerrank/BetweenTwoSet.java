package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;

public class BetweenTwoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a1Diff = 0, a2Diff=0;
		boolean b1=false;
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();

		
		for(int i = 0; i < m; i++){
			int val = sc.nextInt();
			al1.add(val);
			if(i>0 && i<2 ){
				int a1=(Integer)al1.get(i-1);
	 			int a2=(Integer)al1.get(i);
			  	a1Diff= a2-a1; 
			}
		}
		
		
		
		for(int i = 0; i < n; i++){
			int val = sc.nextInt();
			al2.add(val);
			if(i>0 && i<2 ){
				int a1=(Integer)al2.get(i-1);
	 			int a2=(Integer)al2.get(i);
			  	a2Diff= a2-a1; 
			}

		}
		
		for(int j=0; j<m; j++){
			int a1=(Integer)al1.get(j);
			int a2=(Integer)al1.get(j+1);
			if(a1Diff == (a2-a1)){
				b1=true;
			}
		}
	}
}
