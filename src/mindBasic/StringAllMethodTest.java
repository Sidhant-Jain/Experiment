package mindBasic;

import java.io.UnsupportedEncodingException;
import java.lang.StringBuffer;

public class StringAllMethodTest {

	public static void main(String[] args) {
		String str = "i am sidhant jain sidhant ";
		String str1 = "my name is rahul";
		String str2 = "my name is rahul";
		String str3 = "my name is RAHUL";
		String str5 = new String("my name is rahul").intern();
		StringBuffer sb = new StringBuffer("testing chal rai h");
		StringBuffer sb1 = new StringBuffer("my name is rahul");
		StringBuffer sb2 = new StringBuffer("my name is RAHUL");
		String str4 ="";
		char c = str.charAt(3);
		System.out.println("c : " + c);
		int length = str.length();
		System.out.println("length : " + length);
		boolean equals = str2.equals(str1);
		System.out.println("equals : " + equals);
		String trim = str.trim();
		System.out.println("trim : " + trim);
		int length1 = trim.length();
		System.out.println("length1 : " + length1);
		int compareto = str.compareTo(str1);
		System.out.println("compareto : " + compareto);
		int compareto1 = str1.compareTo(str2);
		System.out.println("compareto1 : " + compareto1);
		int compareto2 = str2.compareTo(str3);
		System.out.println("compareto2 : " + compareto2);
		int compareIgnorecase = str2.compareToIgnoreCase(str3);
		System.out.println("compareIgnorecase : " + compareIgnorecase);
		String concat = str.concat(str2);
		System.out.println("concat : " + concat);
		boolean contain = str.contains("am");
		System.out.println("contain : " + contain);
		boolean equalsIgnorCas = str2.equalsIgnoreCase(str3);
		System.out.println("equalsIgnorCas : " + equalsIgnorCas);
		boolean contentEquals = str2.contentEquals(str1);
		System.out.println("contentEquals : " + contentEquals);
		boolean contentEqualsBuffer = str1.contentEquals(sb1);
		System.out.println("contentEqualsBuffer : " + contentEqualsBuffer );
		boolean endsWith = str.endsWith("sidhant");
		System.out.println("endsWith : " + endsWith);
		boolean test = str2==str5;
		System.out.println(test);
		boolean startWith = str.startsWith(" ");
		System.out.println("startWith : " + startWith);
		String subString = str.substring(5);
		System.out.println("subString : " + subString);
		int codePointAt = str.codePointAt(3);
		System.out.println("codePointAt : " + codePointAt);
		int codePouintBefor = str.codePointBefore(3);
		System.out.println("codePouintBefor : " + codePouintBefor);
		int codePointCount = str.codePointCount(2, 7);
		System.out.println("codePointCount : " + codePointCount);
		Object obj = str.getClass();
		System.out.println(obj);
		char []cp = {'s', 'i', 'd', 'j', 'z'};
		str4 =str4.copyValueOf(cp);
		System.out.println("copyValueOf : " + str4);
		String format = String.format("%s = %d", "jain", 35);
		System.out.println("format : "+ format);
		try{
			String getBytes = new String(str2.getBytes( "UTF-8" ));
			System.out.println("getBytes : " + getBytes);			
		}
		catch(UnsupportedEncodingException e){
			System.out.println("handled");
		}
		
		int hashCode = str2.hashCode();
		System.out.println("hashCode : " + hashCode);
		int indexOf = str.indexOf('s');
		System.out.println("indexOf : " + indexOf);
		String intern = str.intern();
		System.out.println("intern : " + intern);
		String str6 = "";
		boolean isEmpty = str6.isEmpty();
		System.out.println("isEmpty : " + isEmpty);
		System.out.println("str4 : " + str4);
		int lastindexof = str.lastIndexOf("jain", 50);
		System.out.println("lastindexof : " + lastindexof);
		boolean matches = str1.matches("(.*)rahul");
		System.out.println("matches : " + matches);
		String replace = str.replace("d", "dd");
		System.out.println("repalce : " + replace);
		String replaceFirst = str.replaceFirst("sidhant", "rahul");
		System.out.println("replaceFirst : " + replaceFirst);
		String subStringRange = str.substring(0, 7);
		System.out.println("subStringRange : " + subStringRange );
		char tocharArray[] = str.toCharArray();
		for(int i =0; i<str.length(); i++){
			System.out.println("tocharArray : " + tocharArray[i]);

		}
		
	}

}
