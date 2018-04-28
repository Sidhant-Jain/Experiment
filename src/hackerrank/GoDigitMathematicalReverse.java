package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoDigitMathematicalReverse {

	static String toString(String a[]){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length;i++){
			sb.append(a[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Pattern pattern = Pattern.compile("[0-9]+|(\\+|-|\\*)");
		Matcher matcher = pattern.matcher(str);
		
		ArrayList<String> al = new ArrayList<>();
		
		while(matcher.find()){
			al.add(matcher.group());
		}
		Collections.reverse(al);
		
		String[] array = al.toArray(new String[al.size()]);
		System.out.println(toString(array));

	}
}
