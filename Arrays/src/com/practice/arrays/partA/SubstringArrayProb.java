package com.practice.arrays.partA;

import java.util.HashSet;
import java.util.Set;

public class SubstringArrayProb {

	public static void main(String[] args) {
		int a[] = {1,2,2,3,1};
		int n = a.length;
		int k =3;
		 minSubarrayDistinctVal(a,n,k);
	}

	private static void minSubarrayDistinctVal(int[] a,int n, int k) {
			int l = 0, r = n;
			for (int i = 0; i < n; i++) 
		    {
				Set<Integer> s = new HashSet<Integer>(); 
		        int j; 
		        for (j = i; j < n; j++)  
		        { 
		            s.add(a[j]); 
		            if (s.size() == k)  
		            { 
		                if ((j - i) < (r - l)) 
		                { 
		                    r = j; 
		                    l = i; 
		                } 
		                break; 
		            } 
		        }
		        if (j == n) 
		            break; 
		  
		    }
			if (l == 0 && r == n) 
		        System.out.println("Invalid k"); 
		    else
		        System.out.println(l + " " + r); 
	}
}
