package challanges;

import java.util.Scanner;
import java.util.ArrayList;

public class Qiuz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		int temp0=0, temp1=0, count=0, count1=0;
		for(int i=0; i<length; i++){
			int k = sc.nextInt();
			if(k==0){
				temp0++;
			}
			else{
				temp1++;
			}
			al1.add(k);
		}
		
		for(int i=0; i<length; i++){
			int k = sc.nextInt();
			if(k==0){
				temp0++;
			}
			else{
				temp1++;
			}
			al2.add(k);
		}
		for(int i=0; i<length; i++){
			if((al1.get(i) ==al2.get(i)) && (al1.get(i)==1) && (al3.indexOf(i) == -1) ){
				count++;
				al3.add(i);
			}
			else if((i!=length-1) && (al1.get(i) ==al2.get(i+1)) && (al1.get(i)==1) && (al3.indexOf(i) == -1)){
				count++;
				al3.add(i+1);
			}
			else if((i!=0) && (al1.get(i) ==al2.get(i-1)) && (al1.get(i)==1) && (al3.indexOf(i-1) == -1)){
				count++;
				al3.add(i);				
			}
		}
		
		count1 = temp1 - (count*2);
		count = count+count1;
		System.out.println(count);
	}

}
