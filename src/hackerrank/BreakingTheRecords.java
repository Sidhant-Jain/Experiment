package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;

public class BreakingTheRecords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0,firstMatchScore = 0, max = 0, min = 0, a[];
		int size = sc.nextInt();
		a = new int[size];
		
		
		ArrayList alMax = new ArrayList();
		ArrayList alMin = new ArrayList();
		
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
			firstMatchScore = a[0];
			
			if(firstMatchScore < a[i] && i>0 ){
				if(max<a[i]){
					max=a[i];
					if(!(alMax.contains(a[i]))){
						alMax.add(a[i]);
					}
				}
			}
			if(firstMatchScore > a[i] && i>0 ){
				if(count==0){
					min = a[0];
					count++;
				}
				
				if(min>a[i]){
					min=a[i];
					if(!(alMin.contains(a[i]))){
						alMin.add(a[i]);
					}
				}
			}
		}
		sc.close();
		
		System.out.println(alMax.size() + " " + alMin.size());
	}
}
