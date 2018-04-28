package mindBasic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTestSumayya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		String a[]=str.split("\"");
		String str1=a[0];
		int startIndex=0;
		int endIndex=0;
		for(int i=0; i<str1.length(); i++){
			if(str.charAt(i)=='['){
				startIndex=i;
			}
			else if(str.charAt(i)==']'){
				endIndex=i;
			}
		}
		
		String result=str1.substring(startIndex+1, endIndex);
		System.out.println(result);
	}
}
