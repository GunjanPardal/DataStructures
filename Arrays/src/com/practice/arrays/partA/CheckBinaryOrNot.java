package com.practice.arrays.partA;

public class CheckBinaryOrNot {

	public static void main(String[] args) {
		int num = 5001;
		int maxElement = checkIfBinary(num);
		System.out.println(maxElement);
	}

	private static int checkIfBinary(int num) {
		int temp =0;
		if(num == 0) {
			return 1;
		}else {
			while(num>0) {
				temp = num%10;
				if(temp > 1) {
					return 0;
				}
				num = num/10;
			}
		}
		return 1;
	}

}
