package com.practice.arrays.partA;

public class SecondLargestInArray {

	static int first, second;
	public static void main(String[] args) {
		int arr[] = { 1, 2, 30, 1, 1, 1 };
		int size = arr.length;
		int secondLargest = secondLargestNum(arr, size);
		System.out.println(secondLargest);
	}

	private static int secondLargestNum(int[] arr, int n) {
		if (n < 2) {
			System.out.println("Invalid!!");
			return -1;
		}
		
		first = second = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if(arr[i]>first) {
				second = first;
				first= arr[i];
			}else if(arr[i]> second && arr[i]!= second) {
				second = arr[i];
			}else  if(arr[i]==first) {
				return -1;
			}
		  }
		if(second == Integer.MIN_VALUE) {
			System.out.println("No second largest!!");
			return -1;
		}
		return second;
		}
	
	

}
