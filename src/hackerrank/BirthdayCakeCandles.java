package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int candle_quantity = sc.nextInt();
		int count =0, a[];
		ArrayList al = new ArrayList();
		
		for(int i=0; i<candle_quantity; i++){
			int candle_size = sc.nextInt();
			al.add(candle_size); 
		}
		Collections.sort(al);
		Collections.reverse(al);
		int j = (Integer)al.get(0);
		int k = al.lastIndexOf(j);
		System.out.println(k+1);
	}
}
