package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is <=1.

Input Format

The first line contains a single integer, n, denoting the size of the array. 
The second line contains n space-separated integers describing the respective values of a0,a1.....,an-1.

Constraints
2<=n<=100
0<ai<100
The answer will be >=2.
Output Format

A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference between any two of the chosen integers is <=1.
 * */

public class PickingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		int n = sc.nextInt();
	
		for(int i=0; i<n; i++){
			int k= sc.nextInt();
			al.add(k);
		}
		Collections.sort(al);
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++){
			int temp=al.get(i+1) - al.get(i);
			if(temp>0){
				al.add(i+1);
			}
		}
	}

}
