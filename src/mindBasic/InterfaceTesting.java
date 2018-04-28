package mindBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceTesting {
	public static void main(String [] args){
		ArrayList<String> al = new ArrayList<>();
		String arr[] = {"s", "i","d", "h", "i" };
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int count =0;
		
		for(int i =0; i< size; i++){
			String k = sc.next();
			al.add(k);
		}
		
		
		
		for(String str : al ){
			count++;
			//System.out.println(str);
		if(str.contains("i")){
			al.remove(count);
		}
		}
		
	}
}
