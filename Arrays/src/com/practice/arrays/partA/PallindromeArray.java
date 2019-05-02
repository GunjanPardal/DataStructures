package com.practice.arrays.partA;

public class PallindromeArray {
	 private static int num =0;
	    private static int rem =0;
	    private static int reverseNum =0;
	    private static int flag =0;
	public static void main(String[] args) {
		int[] a = {121,131,111};
		int val = palinArray(a);
		System.out.println(val);
	}

	private static int palinArray(int[] a) {
		for(int i = 0; i< a.length; i++){
            int originalNum = a[i];
             num = a[i];
             while(num!=0){
                  rem = num%10;
                  reverseNum = reverseNum * 10 + rem;
                  num/=10;
             }
             
            if(originalNum == reverseNum){
            	reverseNum =0;
                flag=1;
            }else {
            	flag = 0;
            }
	}
		return flag;
	}
}
