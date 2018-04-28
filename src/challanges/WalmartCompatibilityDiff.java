package challanges;

import java.util.ArrayList;
import java.util.Scanner;

public class WalmartCompatibilityDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		ArrayList<Integer> arrKholi = new ArrayList<>();
		ArrayList<Integer> arrDhoni = new ArrayList<>();
		int count =0;
		
		for(int i=0; i<length; i++){
			int k=sc.nextInt();
			arrKholi.add(k);
		}
		for(int i=0; i<length; i++){
			int k=sc.nextInt();
			arrDhoni.add(k);
		}
		
		for(int i=0; i<length; i++){
			if(arrKholi.get(i)==arrDhoni.get(i)){
				count++;
			}
		}
		
		System.out.println(count);
	}

}
