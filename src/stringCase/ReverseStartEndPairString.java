package stringCase;

import java.util.Scanner;

//Input==> sidhantjain
//output ==> str :injaantdhsi

public class ReverseStartEndPairString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i=0, j=str.length()-1;
		while(i<str.length()/2){
			if(j-i+1>3){
				String start=str.substring(i, i+2);
				String end=str.substring(j-1, j+1);
				str=str.replace(start, end);
				String res="";
				String res1="";
				String res2="";
				for(int k=str.length()-1; k>=0; k--){
					char c = str.charAt(k);
					res=res+c;
				}
				for(int k=end.length()-1; k>=0; k--){
					char c = end.charAt(k);
					res1=res1+c;
				}
				for(int k=start.length()-1; k>=0; k--){
					char c = start.charAt(k);
					res2=res2+c;
				}
				res=res.replaceFirst(res1, res2);
				str="";
				for(int k=res.length()-1; k>=0; k--){
					char c = res.charAt(k);
					str=str+c;
				}
			}
			i=i+2;	
			j=j-2;
		}	
		System.out.println("str :" + str);
	}
}
