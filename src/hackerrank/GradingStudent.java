package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;

public class GradingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student strength: " );
		
		int strength = sc.nextInt();
		ArrayList al = new ArrayList();
		
		for(int i=0; i<strength; i++){
			int grade = sc.nextInt();
			al.add(grade);
		}
		
		for(int j = 0; j<strength; j++){
			int x= (Integer)al.get(j);
			if(x < 38){
				System.out.println(x);
			}
			else if((x % 5) >= 3){
					x++;
					if(x % 5 == 0){
						System.out.println(x);
					}
					else{
						x++;
						System.out.println(x);
					}
			}
			else{
				System.out.println(x);
			}
			
		}
	}

}
