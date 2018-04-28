package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;

public class AppleNdOrange {

	public static void main(String[] args) {
		int i,count1=0,count2=0,x[];
		
		Scanner sc = new Scanner(System.in);
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		x= new int[6];
		
		for(i=0; i<x.length; i++){
			x[i]=sc.nextInt();
			
		}
		for(int j=0; j < x[4]; j++){
			int d1 = sc.nextInt();
			al1.add(d1);
		}
		for(int j=0; j < x[5]; j++){
			int d1 = sc.nextInt();
			al2.add(d1);
		}
		sc.close();
		for(int k=0; k < al1.size(); k++){
			int l = (Integer)al1.get(k);
			if(((l+x[2]) <= x[1]) && ((l+x[2]) >= x[0])){
				count1++;
			}
		}
		for(int k=0; k < al2.size(); k++){
			int l = (Integer)al2.get(k);
			if(((l+x[3]) <= x[1]) && ((l+x[3]) >= x[0])){
				count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}
}
