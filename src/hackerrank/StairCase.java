package hackerrank;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur size: ");
		int size = sc.nextInt();
		//String str = sc.next();
		
		for(int i = size; i > 0; i--){
			for(int j = 0; j < i-1; j++){
				System.out.print(" ");
			}
			for(int k = i; k <= size; k++){
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
