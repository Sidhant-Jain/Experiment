package mindBasic;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeMap;


public class Main {
 	public static void main (String[] args) throws java.lang.Exception 
 	{
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> al = new ArrayList<>();
      TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
      HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
      int temp=0, k=0,temp1=0;
      int size=sc.nextInt();
      int equals=sc.nextInt();

      for(int i=2; i<(size*2);i++){
    	  k=sc.nextInt();
    	  System.out.println(k);
    	 if(i%2 == 0){
    		 if(temp==0){
    			 temp=k;
    			 System.out.println("temp : " + temp);
    		 }
    		 else if(temp!=k){
    			 hm.put(temp, al);
    			 System.out.println(hm);
    			 al.clear();
    			 System.out.println("hm :" + hm);
    			 temp=k;
    		 }
    	 }
    	 else if(temp!=0){
    		 al.add(k);
    		 System.out.println("al : " + al);
    	 }
     }
    	 hm.put(temp, al);
    	 System.out.println(hm);
      System.out.println(hm.get(equals)); 
    }
}
