package com.practice.arrays.partA;

public class ReplaceulPrevNxt {

	public static void main(String[] args) {
		 int a[] = {3, 6, 1, 7, 8, 2};
		 int n = a.length;
		 modify(a,n);
		 for(int i =0; i<n;i++) {
			 System.out.println("element->"+a[i]);
		 }
	}

	private static void modify(int[] a, int n) {
		if (n <= 1)
		      return;
		int prev = a[0];
	    a[0] = a[0] * a[1];
	    for (int i=1; i<n-1; i++)
	    {
	        int curr = a[i];
	        a[i] = prev * a[i+1];
	        prev = curr;
	    }
	    a[n-1] = prev * a[n-1];
	}

}
