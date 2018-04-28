package hackerrank;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		long sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, tempLow = 0, tempHigh = 0;
		sum1 = a + b + c + d;
		sum2 = a + b + c + e;
		sum3 = a + b + d + e;
		sum4 = a + c + d + e;
		sum5 = b + c + d + e;

		System.out.println("sum1res : " + sum1);
		System.out.println("sum2res : " + sum2);
		System.out.println("sum3res : " + sum3);
		System.out.println("sum4res : " + sum4);
		System.out.println("sum5res : " + sum5);

		if (sum1 > sum2) {
			if (sum1 > sum3) {
				if (sum1 > sum4) {
					if (sum1 > sum5) {
						tempHigh = sum1;
						System.out.println("sum1: " + sum1);
					} else {
						tempHigh = sum5;
						System.out.println("sum5: " + sum5);
					}
				} else if (sum4 > sum5) {
					tempHigh = sum4;
					System.out.println("sum4 : " + sum4);
				} else {
					tempHigh = sum5;
					System.out.println("sum51 : " + sum5);
				}
			} else if (sum3 > sum4) {
				if (sum3 > sum5) {
					tempHigh = sum3;
					System.out.println("sum3: " + sum3);
				} else {
					tempHigh = sum5;
					System.out.println("sum5: " + sum5);
				}
			} else if (sum4 > sum5) {
				tempHigh = sum4;
				System.out.println("sum41: " + sum4);
			} else {
				tempHigh = sum5;
				System.out.println("sum52 : " + sum5);
			}
		} else if (sum2 > sum3) {
			if (sum2 > sum4) {
				if (sum2 > sum5) {
					tempHigh = sum2;
					System.out.println("sum2: " + sum2);
				} else {
					tempHigh = sum5;
					System.out.println("sum53: " + sum5);
				}
			} else if (sum4 > sum5) {
				tempHigh = sum4;
				System.out.println("sum42 : " + sum4);
			} else {
				tempHigh = sum5;
				System.out.println("sum54 : " + sum5);
			}
		} else if (sum3 > sum4) {
			if (sum3 > sum5) {
				tempHigh = sum3;
				System.out.println("sum31: " + sum3);
			} else {
				tempHigh = sum5;
				System.out.println("sum55 : " + sum5);
			}
		} else if (sum4 > sum5) {
			tempHigh = sum4;
			System.out.println("sum43 : " + sum4);
		} else {
			tempHigh = sum5;
			System.out.println("sum56 : " + sum5);
		}
		
		// low
		
		if (sum1 < sum2) {
			if (sum1 < sum3) {
				if (sum1 < sum4) {
					if (sum1 < sum5) {
						tempLow = sum1;
						System.out.println("sum1: " + sum1);
					} else {
						tempLow = sum5;
						System.out.println("sum5: " + sum5);
					}
				} else if (sum4 < sum5) {
					tempLow = sum4;
					System.out.println("sum4 : " + sum4);
				} else {
					tempLow = sum5;
					System.out.println("sum51 : " + sum5);
				}
			} else if (sum3 < sum4) {
				if (sum3 < sum5) {
					tempLow = sum3;
					System.out.println("sum3: " + sum3);
				} else {
					tempLow = sum5;
					System.out.println("sum5: " + sum5);
				}
			} else if (sum4 < sum5) {
				tempLow = sum4;
				System.out.println("sum41: " + sum4);
			} else {
				tempLow = sum5;
				System.out.println("sum52 : " + sum5);
			}
		} else if (sum2 < sum3) {
			if (sum2 < sum4) {
				if (sum2 < sum5) {
					tempLow = sum2;
					System.out.println("sum2: " + sum2);
				} else {
					tempLow = sum5;
					System.out.println("sum53: " + sum5);
				}
			} else if (sum4 < sum5) {
				tempLow = sum4;
				System.out.println("sum42 : " + sum4);
			} else {
				tempLow = sum5;
				System.out.println("sum54 : " + sum5);
			}
		} else if (sum3 < sum4) {
			if (sum3 < sum5) {
				tempLow = sum3;
				System.out.println("sum31: " + sum3);
			} else {
				tempLow = sum5;
				System.out.println("sum55 : " + sum5);
			}
		} else if (sum4 < sum5) {
			tempLow = sum4;
			System.out.println("sum43 : " + sum4);
		} else {
			tempLow = sum5;
			System.out.println("sum56 : " + sum5);
		}
		
		// print
		System.out.println("low: " + tempLow + "high: " + tempHigh);
	}

}
