package hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BrowserStack {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> row1 = new ArrayList<>();
		ArrayList<String> row2 = new ArrayList<>();
		ArrayList<String> row3 = new ArrayList<>();
		int row2Count=0;
		
//		String str1 = br.readLine();
//		System.out.println(str1);
		String str2 = br.readLine();
		System.out.println(str2);
//		String str3 = br.readLine();
//		
		String arr2[]=str2.split(",");
		for(int i=0; i<arr2.length; i++){
			arr2[i]=arr2[i].trim();
			row2.add(arr2[i]);
			
		}
		for(int i=0; i<arr2.length; i++){
			if(arr2[i]=="_"){
				
			}
		}
		
		System.out.println(arr2.length);
//		String arr[]=str1.split(",");
//		for(int i=0; i<arr.length; i++){
//			System.out.println(arr[i].trim());
//			if(i==0 && i%2==0){
//				int temp=Integer.parseInt(arr[i]);
//			}	
//		}
//		System.out.println(arr);

	}

}
