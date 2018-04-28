package geeksForgeeks;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ContinousArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your data");
		ArrayList<Integer> al=new ArrayList<Integer>();
		int arrSize = sc.nextInt();
		
		for(int i=0; i<arrSize; i++){
			int k= sc.nextInt();
			al.add(k);
		}
		
		Collections.sort(al);
		//System.out.println(al);
		boolean flag=true;
		for(int j=0; j<al.size()-1; j++){
			//System.out.println(j);
			int f1=(Integer)al.get(j);
			//System.out.println("f1 : " + f1);
			int f2=al.get(j+1);
			//System.out.println("f2 : " + f2);
			if(((al.get(j)!=al.get(j+1)) && (f2-f1!=1)) || ((al.get(j)==al.get(j+1)) && (f2-f1!=1))){
				System.out.println("No");
				flag=false;
			}
		}
		
		if(flag){
			System.out.println("Yes");
		}
	}

}
