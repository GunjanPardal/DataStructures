package com.practice.arrays.partA;

public class ProductArray {

	public static void main(String[] args) {
		int arr[] = { 10, 3, 5, 6, 2 };
		int n = arr.length;
		System.out.println("The product array is : ");
		productArray(arr, n);
	}

	private static void productArray(int[] arr, int n) {
		int i, temp = 1; 
		int prod[] = new int[n];
		for(int j=0;j<n;j++) {
			prod[j]=1;
		}
		
		for (i = 0; i < n; i++)  
        { 
            prod[i] = temp; 
            temp *= arr[i]; 
        }
		temp = 1;
		 for (i = n - 1; i >= 0; i--)  
	        { 
	            prod[i] *= temp; 
	            temp *= arr[i]; 
	        } 
		for (i = 0; i < n; i++) 
            System.out.print(prod[i] + " "); 
	}

}
