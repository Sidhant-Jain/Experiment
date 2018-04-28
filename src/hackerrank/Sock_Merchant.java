package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;

public class Sock_Merchant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		int count =0, size = sc.nextInt();
		
		for(int i=0; i<size; i++){
			int k = sc.nextInt();
			if(al.contains(k)){
				int index = al.indexOf(k);
//				System.out.println(index);
				al.remove(index);
				count++;
			}
			else{
				al.add(k);
			}
		}
		System.out.println(count);
	}

}
