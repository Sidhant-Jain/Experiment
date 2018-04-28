package hackerrank;

/*Marie invented a Time Machine and wants to test it by time-travelling to visit Russia on the Day of the Programmer (the 256 day of the year) during a year in the inclusive range from 1700 to 2700.

From 1700 to 1917, Russia's official calendar was the Julian calendar; since 1919 they used the Gregorian calendar system. The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32 day of the year in Russia.

In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap year, and 28 days during all other years. In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar, leap years are either of the following:

Divisible by 400.
Divisible by 4 and not divisible by 100.
Given a year, y, find the date of the 256th day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is y.
*/

import java.util.Scanner;

public class DayOfTheProgrammer {

    static String solve(int year){
    	String str = "";
    	if(year>=1700 && year<1918){
    		if(year%4==0){
    			str = "12.09." + year;
    		}
    		else{
    			str = "13.09." + year;
    		}
    	}
    	if(year>=1919 && year <= 2700){
    		if((year%4==0 && year%100!=0) || (year%400==0)){
    			str = "12.09." + year;
    		}
    		else{
    			str = "13.09." + year;
    		}
    	}
    	if(year==1918){
    		str = "26.09." + year;
    	}
    	    	
    	return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

}