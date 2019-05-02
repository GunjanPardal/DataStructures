package com.practice.arrays.partA;

import java.util.Arrays;

public class ThirdLastElement {

	public static void main(String[] args) {
	int[] arr = new int[] {2,4,7,9,8};
	int maxElement = maxThirdElement(arr);
	System.out.println(maxElement);
	}

	private static int maxThirdElement(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-3];
	}


}
