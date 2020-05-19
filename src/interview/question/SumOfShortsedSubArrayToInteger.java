/*14. Implement a function that takes in an array of non-negative numbers and an integer.
Return the *LENGTH* of the shortest subarray whose sum is at least the integer, and -1 if no such sum exists.
*/
package interview.question;

import java.util.Arrays;
import java.util.HashMap;

public class SumOfShortsedSubArrayToInteger {
	
	public String shortestSubArray(int[] arr, int item) {
		HashMap<String, Integer> hm = new HashMap<>();
		String result = null ;
		for(int i = 0; i<arr.length; i++ ) {
			int k = arr[i];
			if(k==item) {
				 hm.put(""+(arr[i]), 1);
			}
			for(int j = i+1; j<arr.length && i<arr.length-1;j++) {
				k = k+arr[j];
				if(k==item) {
					 result = Arrays.toString(Arrays.copyOfRange(arr, i, j+1));
					 hm.put(result, j-i+1);
				}
			}
		}
		System.out.println(hm);
		int smallest = arr.length+1;
		String str= null;
		for(String key:hm.keySet()) {
			if(smallest>hm.get(key));
			smallest = hm.get(key);
			str = key;
		}
		return str;
		
	}
	/*Smallest subarray with sum greater than a given value*/
	public int smallestSubArray(int[] arr, int n) {
		int min_length = arr.length+1;
		
		for(int i =0; i<arr.length; i++) {
			int cur_sum = arr[i];
			if(cur_sum==n)
				return 1;
			for(int j = i+1; j<arr.length; j++) {
				cur_sum = cur_sum+arr[j];
				if(cur_sum ==n && (j-i+1<min_length)) {
					min_length=j-i+1;
					}
				}
		}
		return min_length;
	}
	public static void main(String[] args) {
		SumOfShortsedSubArrayToInteger obj = new SumOfShortsedSubArrayToInteger();
		System.out.println(obj.shortestSubArray(new int[] {2,4,6,2,2,8,2,10}, 10));
		System.out.println(obj.smallestSubArray(new int [] {2,4,6,2,2,8,2,10}, 10));

	}

}
