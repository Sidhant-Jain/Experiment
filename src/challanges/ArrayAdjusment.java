package challanges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayAdjusment {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		
		for(int i=0; i<arrSize; i++){
			int k=sc.nextInt();
			al.add(k);
		}
		
		Collections.sort(al);
		int calc=0, calc1=2147483647, reversePointer=al.size()-1, currentIndex=0;
		boolean flag=false;
		for(int j=0; j<al.size(); j++){
			currentIndex=j;
			calc=calc+al.get(j);
			if(calc>al.get(j)){
				if(j!=al.size()-2){
					if(!flag){
						calc=calc-al.get(j);
						calc1=calc+al.get(reversePointer);
						calc=al.get(j);
					}
					if(calc1<calc){
						calc=calc-al.get(currentIndex-1);
						calc1=calc1+al.get(currentIndex-1);
					}
				}
				else{
					break;
				}
			}
		}
		System.out.println(calc + " " +  calc1);
	}
}
