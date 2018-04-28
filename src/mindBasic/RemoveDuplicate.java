package mindBasic;

import java.util.Scanner;
import java.util.ArrayList;
public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		int size=sc.nextInt();
		int a[] = new int[size];
		int arr[] = new int[size];
		int temp=0;
		
		for(int i=0; i<size; i++){
			int k=sc.nextInt();
			a[i]=k;
		}
		
		for(int i=0; i<size; i++){
			int count=0;
			for(int j=0; j<=temp; j++){
				if(a[i]==arr[j]){
					count++;
				}
			}
			System.out.println("count = " + count);
			if(count==0){
				arr[temp]=a[i];
				temp++;
			}
		}
		System.out.println(arr);
	}
}
