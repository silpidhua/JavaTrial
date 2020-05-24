/*26.Find the shortest subarray which gives the maximum sum*/
package interview.question;

import java.util.Arrays;

class MaxSum{
	public String findMaxSum(int[] arr, int k) {
		String resultarr= null;
		if(k> arr.length) {
			return null;
		}
		int result = 0,max = 0;
		for(int i=0; i<k; i++) {
			result+=arr[i];
			max= result;
		}
		for(int i = k; i<arr.length; i++) {
			result = result+arr[i]-arr[i-k];
			if(result>max) {
				max = result;
				resultarr=Arrays.toString(Arrays.copyOfRange(arr, i-k+1, i+1));
			}
		}
		return resultarr+"-"+max;
	}
}

public class ShortestSubarrayWithMaximumSum {
	public static void main(String args[]) {
		MaxSum obj = new MaxSum();
		System.out.println(obj.findMaxSum(new int[] {11, 4, 2, 10, 23, 3, 1, 0, 20}, 4));
		System.out.println(obj.findMaxSum(new int[] {100, 200, 300, 400}, 2));
	}
}
