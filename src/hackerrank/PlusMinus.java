package hackerrank;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		int a[];
		float pos = 0, neg = 0, ze = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur size: ");
		int size = sc.nextInt();
		a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
			if (a[i] > 0) {
				pos++;
			} else if (a[i] < 0) {
				neg++;
			} else {
				ze++;
			}
		}
		System.out.println("pos: " + pos + " neg: " + neg + " ze: " + ze + " size: " + size);
		System.out.println(pos = pos / size);
		System.out.println(neg = neg / size);
		System.out.println(ze = ze / size);

	}

}
