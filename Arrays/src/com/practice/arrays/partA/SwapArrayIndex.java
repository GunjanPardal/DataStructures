package com.practice.arrays.partA;

public class SwapArrayIndex {

	public static void main(String[] args) {
		int arr[] = {3, 2, 1, 0};
		int swap[] = swapArrIndex(arr);
		for(int i =0; i<swap.length;i++) {
			System.out.println("elements-->"+swap[i]);
		}
	}

	private static int[] swapArrIndex(int[] arr) {
		int swap [] = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			swap[arr[i]] = i;
		}
		return swap;
	}

}
