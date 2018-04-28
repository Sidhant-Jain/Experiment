package hackerrank;

/*Monica wants to buy exactly one keyboard and one USB drive from her favourite electronics store. The store sells n different brands of keyboards and m different brands of USB drives. Monica has exactly S dollars to spend, and she wants to spend as much of it as possible (i.e., the total cost of her purchase must be maximal).

Given the price lists for the store's keyboards and USB drives, find and print the amount money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.

Note: She will never buy more than one keyboard and one USB drive even if she has the leftover money to do so.

Input Format

The first line contains three space-separated integers describing the respective values of S (the amount of money Monica has), n (the number of keyboard brands) and m (the number of USB drive brands). 
The second line contains n space-separated integers denoting the prices of each keyboard brand. 
The third line contains m space-separated integers denoting the prices of each USB drive brand.*/

import java.util.Scanner;

public class ElectronicShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();
		int keyboard = sc.nextInt();
		int mouse = sc.nextInt();
		electricItems(money, keyboard, mouse);
		sc.close();
	}

	public static int electricItems(int money, int keyboard, int mouse) {

		int kb[], usb[];
		int temp = 0, temp1 = -1;
		kb = new int[keyboard];
		usb = new int[mouse];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < kb.length; i++) {
			kb[i] = sc.nextInt();
		}
		for (int i = 0; i < usb.length; i++) {
			usb[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < kb.length; i++) {
			for (int j = 0; j < usb.length; j++) {
				temp = kb[i] + usb[j];
				if ((temp > temp1 && temp <= money)) {
					temp1 = temp;
				}
			}
		}
		System.out.println(temp1);
		return temp1;
	}
}