package com.practice.arrays.partA;

import java.util.Arrays;

public class MeanMedian {

	public static void main(String[] args) {
		int a[] = { 1,2,3,4,5 };
		int meanMedian[] = findMeanMedian(a);
		for (int i = 0; i < meanMedian.length; i++) {
			System.out.println("mean & median=-->" + meanMedian[i]);
		}
	}

	private static int[] findMeanMedian(int[] a) {
		Arrays.sort(a);
		int meanMed[] = new int[2];
		int mean = findMean(a);
		int median = findMedian(a);
		meanMed[0]= mean;
		meanMed[1]= median;
		return meanMed;
	}
	

	private static int findMedian(int[] a) {
		int median =0;
		int n = a.length;
		if(n%2 ==0) {
			median = (a[(n-1)/2]+a[n/2]);
		}else {
			median = a[a.length/2];
		}
		return median;
	}

	private static int findMean(int[] a) {
		int sum =0;
		int mean = 0;
		for(int i =0; i<a.length;i++) {
			sum+=a[i];
		}
		mean = sum/a.length;
		return mean;
	}

}
