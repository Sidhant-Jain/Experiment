package hackerrank;

/*Two cats named A and B are standing at integral points on the x-axis. Cat A is standing at point x and cat B is standing at point y. Both cats run at the same speed, and they want to catch a mouse named C that's hiding at integral point z on the x-axis. Can you determine who will catch the mouse?

You are given q queries in the form of x, y, and z. For each query, print the appropriate answer on a new line:

If cat A catches the mouse first, print Cat A.
If cat B catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
Input Format

The first line contains a single integer, q, denoting the number of queries. 
Each of the q subsequent lines contains three space-separated integers describing the respective values of x (cat 's location), y (cat 's location), and z (mouse 's location).

Constraints

Output Format

On a new line for each query, print Cat A if cat A catches the mouse first, Cat B if cat B catches the mouse first, or Mouse C if the mouse escapes.*/

import java.util.Scanner;

public class CatsNdMouse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int entry = sc.nextInt();
		String str1[] = new String[entry];
		
		for(int i=0; i<entry; i++){
			int cat1=sc.nextInt();
			int cat2=sc.nextInt();
			int mouse=sc.nextInt();
			str1[i]=whoCatchFirst(cat1, cat2, mouse);
		}
		sc.close();
		for(int i=0; i<entry;i++){
			System.out.println(str1[i]);
		}
	}
	
	public static String whoCatchFirst(int cat1, int cat2, int mouse) {
		String str="";
		int distance1= Math.abs(cat1-mouse);
		int distance2=Math.abs(cat2-mouse);
		if(distance1<distance2){
			str="Cat A";
		}
		else if(distance2<distance1){
			str="Cat B";
		}
		else if(distance1==distance2){
			str="Mouse C";
		}
		return str;
	}

}
