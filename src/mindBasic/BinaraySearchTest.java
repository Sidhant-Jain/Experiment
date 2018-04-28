package mindBasic;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;


public class BinaraySearchTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();

//		try{
//			BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
//			String line ="";
//			
//			while((line = br.readLine()) != null){
//				if(line.contains("/n")){
//					
//				}
//			}
//			
//		}
//		catch(IOException e){
//			System.out.println();
//		}
	
		for(int i = 0; i<10; i++){
			int k = sc.nextInt();
			al.add(k);
		}
		
		int find = sc.nextInt();
		
		Collections.sort(al);
		
		System.out.println(al);
		int place = search(al, find);
		
		System.out.println(place);
	}
	
	static int search(ArrayList<Integer> a1, int find){
			int mid, low =0, high = a1.size()-1;
			
			while(low <= high){
				mid = low + ((high - low)/2);
				if(a1.get(mid) == find){
					return mid;
				}
				else if(a1.get(mid) < find){
					low = mid + 1;
				}
				else{
					high = mid - 1;
				}
			}
			
			return -1;
		
	}

}
