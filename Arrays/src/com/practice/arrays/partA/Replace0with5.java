package com.practice.arrays.partA;

public class Replace0with5 {
	public static void main(String[] args) {
		int a = 1004;
		int val = replaceZero(a);
		System.out.println(val);
 	}

	private static int replaceZero(int a) {
		int arr[] = new int[10]; 
		int tmp,rem,j=0,k,ans;
		tmp = a;
		while(tmp>0) {
		rem = tmp%10;
		if(rem == 0)
		arr[j] = 5;
		else
		arr[j] = rem;
		j++;
		tmp = tmp/10;
		}
		ans = 0;
		for(k=(j-1); k>=0; k--)
		ans = ans*10 + arr[k];
		return ans;
	}
}
