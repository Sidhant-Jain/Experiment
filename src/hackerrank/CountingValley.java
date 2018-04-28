package hackerrank;

import java.util.Scanner;

public class CountingValley {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int level=0,  vallay=0, prev =0, steps=sc.nextInt();
		String str = sc.next();
		
		for(int i =0; i<str.length(); i++){
			if(str.charAt(i) == 'U'){
				//up++;
				level++;
			}
			else{
			//	dwn++;
				level--;
			}
			if(level==0  && prev == -1){
				vallay++;
			}
			prev =level;
		}
		System.out.println(vallay);
	}

}
