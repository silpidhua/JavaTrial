/*1)Find the shortest subarray which gives the maximum sum*/
package com.java.acct;

import java.util.Arrays;

public class ShortestSubarrayMaxSum {
	
	int subArrayMax(int a[]) {
		if(a.length==1) {
			return a[0];
		}
		else if (a.length==0) {
			return 0;
		}
		else {
			int sum  = 0;
			int val1 =  subArrayMax( Arrays.copyOfRange(a, 0, a.length-2));
			int val2 = subArrayMax( Arrays.copyOfRange(a, 1, a.length-1));
			for(int i=0; i<a.length;i++) {
				sum = sum+i;
			}
			return Math.max(Math.max(val1,val2),sum);
		}
		
			
		
	}

	public static void main(String[] args) {
		ShortestSubarrayMaxSum obj = new ShortestSubarrayMaxSum();
		System.out.println(obj.subArrayMax(new int[]{2,3,4,5}));
	}

}
