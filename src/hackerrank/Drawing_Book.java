package hackerrank;

import java.util.Scanner;

public class Drawing_Book {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int page_size = sc.nextInt();
		int need_page = sc.nextInt();
		int count = 0, first = 1, last = page_size, now= 0;
		
		if(need_page <= page_size/2){
			now = first;
			while(need_page > now){
				now = now+2;
				count++;
			}
		}
		else{
			if(last%2 == 0){
				now = last;
			}
			else{
				now = last-1;
			}
			while(need_page < now){
				now = now - 2;
				count++;
			}
		}
		System.out.println(count);
	}

}
