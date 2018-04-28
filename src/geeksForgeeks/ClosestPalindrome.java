package geeksForgeeks;

import java.util.Scanner;

public class ClosestPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string : ");
		String palindromNum = sc.next();
		
		String result = getPalindrom(palindromNum);		
		System.out.println("Your output is : " +  result);
	}
	
	public static String getPalindrom(String palindromNum){
		int length = palindromNum.length();
		String newString="";
		if(length%2==0){
			String str = palindromNum.substring(length/2-1, length/2+1);
			//System.out.println(str);
			char c=str.charAt(0);
			char c1=str.charAt(1);
			int a = Character.getNumericValue(c);
			a=a+1;
			int b= Character.getNumericValue(c1);
			b=b+1;
			String res= String.valueOf(a)+String.valueOf(b);
			newString= palindromNum.substring(0, length/2-1) + res + palindromNum.substring(length/2+1, palindromNum.length());
//			System.out.println(newString);
		}
		else{
			String str = palindromNum.substring(length/2, length/2+1);
		//	System.out.println(str);
			char c=str.charAt(0);
			int a = Character.getNumericValue(c);
			a=a+1;
			String res= String.valueOf(a);
			newString= palindromNum.substring(0, length/2) + res + palindromNum.substring(length/2+1, palindromNum.length());
//			System.out.println(newString);
		}
		
		
		return newString;
	}

}
