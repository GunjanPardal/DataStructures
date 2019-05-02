package com.practice.arrays.partA;

public class CountOfSmallerElements {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,3,4,5,7,8,9,9,10,22,33,44};
		int ttlElements = countSmallerElements(arr,11);
		System.out.println(ttlElements);
	}

	private static int countSmallerElements(int[] arr, int key) {
		int left = 0, right = arr.length-1;
		int mid;
		int count = 0;
		while(left < right) {
			mid = (left+right)/2;
			if(key >= arr[mid]) {
				left = mid+1;
		}else {
			break;
		}
		
	}
		count = left-0;
		return count;
}
}
