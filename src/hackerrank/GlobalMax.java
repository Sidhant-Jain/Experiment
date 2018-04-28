package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;

public class GlobalMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a[], b[];
		a= new int[x];
		int i,temp=0,count=0;
		
		
		
		for(i =0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		
		
		int y = sc.nextInt();
		
		if(a.length>y){
			if(a.length>3){
				for(int j=0; j<a.length; j++){
					temp =a[j+1]-a[j];
					if(count<temp){
						count=temp;
					}
				}
			}
			else{
				count=a[a.length-1] -a[i];
						
			}
		}
		else{
			for(int j=0; j<a.length; j++){
				temp =a[j+1]-a[j];
				if(count<temp){
					count=temp;
				}
			}
		}
		
//		for(int i=0; i<a.length; i++){
//			ArrayList al = new ArrayList();
//			for(int j=i; j<y; j++){
//				al.add(a[j]);
//				
//			}
//			
//			for(int k=0; k<al.size(); k++){
//				
//			}
//			
//		}
	}

}
