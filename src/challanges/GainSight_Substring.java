package challanges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GainSight_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("enter ur size: ");
			//int size = sc.nextInt();
			String str = sc.next();
			//int count=0;
			Set<String> set = new HashSet<>();
			for(int i = 0; i < str.length(); i++){
				String str1 = str.substring(i, str.length());
				//System.out.println("Str1: " + str1);
				for(int j = str1.length(); j > 0; j--){
					System.out.println(str1.substring(0, j));
					
					set.add(str1.substring(0, j));
//					System.out.println(str1.substring(0, j));
					//count++;
				}
			}
			System.out.println(set.size());
		

	}

}
