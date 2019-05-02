package com.practice.arrays.partA;

public class MinimumStepsDesiredArray {

	public static void main(String[] args) {
		int a[] = { 2, 2, 2 };
		int min_steps = desiredarr(a);
		System.out.println("min steps-->" + min_steps);
	}

	private static int desiredarr(int[] a) {
		int count = 0;
		int tot_zero = a.length;
		boolean is_divided = false;
		while (tot_zero != 0) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 0)
					continue;
				else if (a[i] % 2 == 0) {
					is_divided = true;
					a[i] = a[i] / 2;
				} else if (a[i] == 1){
					a[i] = 0;
					count++;
					tot_zero--;
				} else if (a[i] % 2 == 1) {
					is_divided = true;
					a[i] = (a[i] - 1) / 2;
					if (a[i] == 0) {
						tot_zero--;
					}
				}
				if (is_divided == true) {
					count++;
				}
			}
		}
		return count;
	}

}
