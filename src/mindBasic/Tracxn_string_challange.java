package mindBasic;

import java.util.Scanner;

public class Tracxn_string_challange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		char c, c1;
		String check, check1, temp="";
		boolean b1=false;
		int n = str.length();
		
		for(int i=0; i<n-1; i++){
			System.out.println(i);
			check=Character.toString(str.charAt(i));
			System.out.println(i + check);
			if(i!=0){
				check1=Character.toString(str.charAt(i-1));
				if(check.equals(check1)){
					temp=check1;
					str=str.replace(check, "");
					str=str.replace(check1, "");
					i=i-2;
					n=n-2;
				}
				else if(check.equals(temp)){
					str.replace(check, "");
					i=i-1;
					n=n-1;
				}
			}
		}
		if(str.isEmpty()){
			System.out.println("null");
		}
		else{
			System.out.println(str);
		}
	}
}