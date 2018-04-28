package challanges;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WalmartMakeLargeDigit {

	static int index=0, count=0, incr=0, arrLoop=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		String str=sc.next();
		char arr[]=str.toCharArray();
		for(int i=0; i<arr.length; i++){
			al.add(Character.getNumericValue(arr[i]));
		}
		
		arrLoop=sc.nextInt();
		while(arrLoop>count){
			System.out.println(count);
			arrLoop=arrLoop-count;
			arrLoop=incr+arrLoop;
			System.out.println(count + "" + arrLoop+ "" + incr+ "" + index);
			
			m1(arrLoop, al);
			incr++;
			index=incr;
		}
		
	}
	
	public static ArrayList<Integer> m1( int arrLoop, ArrayList<Integer> al){
		for(int i=incr; i<arrLoop-1; i++){
			if(al.get(i)<al.get(i+1)){
				if(al.get(index)<al.get(i+1)){
					index=i+1;
				}
			}
		}
		System.out.println(al);
		for(int i=index; i>0; i--){
			Collections.swap(al, i-1, i);
			count++;
		}
		System.out.println(al);
		System.out.println(count);

		return al;
	}
}
