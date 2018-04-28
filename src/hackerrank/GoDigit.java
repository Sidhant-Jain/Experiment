package hackerrank;

/*
 * Input ==> abaabbbcc
 * output ==> aba2b3c2
 * */

import java.util.Scanner;

public class GoDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char chr[]=str.toCharArray();
		String result="";
		
		int count=1;
		for(int i=0; i<chr.length-1; i++){
			if(chr[i]==chr[i+1]){
				count++;
			}
			else {
				if(count>1){
					result=result+chr[i]+count;
					count=1;
				}
				else{
					result=result+chr[i];
				}
			}
			
//			if(i==chr.length-2){
//				result=result+chr[i]+count;
//				count=1;
//			}
		}
		if(count>1){
			result=result+chr[chr.length-2]+count;
		}
		else{
			result=result+chr[chr.length-1];
		}
		System.out.println(result);
	}
}
