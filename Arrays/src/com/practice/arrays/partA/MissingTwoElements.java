package com.practice.arrays.partA;

public class MissingTwoElements {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 5,3 };
		int n = arr.length + 2;
		int [] missingElements = findTwoMissingNumbers(n, arr);
		for(int i =0 ; i< missingElements.length ; i++) {
			System.out.println("Missing Elements=>"+missingElements[i]);
		}
	}

	private static int[] findTwoMissingNumbers(int n, int[] arr) {
		int sum = 0;
		int rangeSum = 0;
		int sumDiff = 0;
		int pivot = 0;
		int totalLeftXOR = 0;
		int arrLeftXOR = 0;
		int totalRightXOR = 0;
		int arrRightXOR = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		for (int j = 1; j <= n; j++) {
			rangeSum = rangeSum + j;
		}

		sumDiff = rangeSum - sum;
		pivot = sumDiff / 2;

		for (int i = 1; i <= pivot; i++) {
			totalLeftXOR ^= i;
		}
		for (int j = pivot+1; j <= n; j++) {
			totalRightXOR ^= j;
		}
		for (int i : arr) {
			if (i <= pivot) {
				arrLeftXOR ^= i;
			}else {
				arrRightXOR ^= i;
			}
		}
		return new int[] {totalLeftXOR ^ arrLeftXOR, totalRightXOR ^ arrRightXOR};
	}

}
