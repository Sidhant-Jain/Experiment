package hackerrank;

import java.util.Scanner;;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		int count1 = x1+v1, count2 = x2+v2;
		
		if(x1>=0 && x2>x1 && v2>0 && v1>v2){
			if(count2>count1){
				while(true){
					if(count1 == count2){
						System.out.println("YES");
						break;
					}
					else if(count1>count2){
						System.out.println("NO");
						break;
						}
					else{
						count1+=v1;
						count2+=v2;
					}
				}
			}
			else if(count2==count1){
				System.out.println("YES");
				}
			else{
				System.out.println("NO");
			}
		}
		else{
			System.out.println("NO");
		}
		
		
	}

}
