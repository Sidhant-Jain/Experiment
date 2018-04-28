package hackerrank;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		String str2 = "12:00:00AM";
		String str3 = "12:00:00PM";
		String strConvert = "";
		String str4="";
		int count=0;
		
		if(time.equals(str2)){
			strConvert = "00:00:00";
			System.out.println("strConvert: " + strConvert );
		}
		else if(time.equals(str3)){
			strConvert = "12:00:00";
			System.out.println("strConvert: " + strConvert );
		}
		else{
			if(time.contains("AM")){
				str4=time.substring(0, 2);
				int x=Integer.parseInt(str4);
				if(x==12 || x==24){
					strConvert=time.substring(2, 8);
					strConvert="00"+strConvert;
					strConvert.toString();
					strConvert=strConvert.substring(0, 8);
					System.out.println("strConvert: " + strConvert );
				}
				else{
					strConvert=time.substring(0, 8);
					System.out.println("strConvert: " + strConvert );
				}
			}
			else if(time.contains("PM")){
				str4=time.substring(0, 2);
				int x=Integer.parseInt(str4);
				if(x<12){
					x=x+12;
					strConvert=time.substring(2, 8);
					strConvert=x+strConvert;
					strConvert.toString();
					strConvert=strConvert.substring(0, 8);
					System.out.println("strConvert: " + strConvert );
				}
				else if(x<24){
					strConvert=time.substring(0, 8);
					System.out.println("strConvert: " + strConvert );
				}
			}
		}
	}
}
