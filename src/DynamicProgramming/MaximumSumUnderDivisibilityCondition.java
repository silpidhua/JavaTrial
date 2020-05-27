package DynamicProgramming;

import java.util.Arrays;

public class MaximumSumUnderDivisibilityCondition {
	
	public int[] findSumUnderDivisibilityCondition(int[] arr) {
		int[] retArr = new int[arr.length];
		retArr[0] = arr[0];
		
		for(int i = 2; i<=arr.length; i++) {
			int temp=arr[i-1];
			for(int j=1; j<Math.sqrt(i); j++) {
				if(i%j==0) {
					temp=temp+arr[j-1];
				}
			}
			retArr[i-1]=temp;
			
		}
		return retArr;
	}
	public void printMaxSum(int[] arr) {
		int retArr[] = new int[arr.length];
		Arrays.fill(retArr, 0);
		
		for(int i =0; i<arr.length;i++) {
			retArr[i]= arr[i];
			int max =0;
			for(int j=1;j<Math.sqrt(i+1); j++) {
				if((i%j==0)&&(i+1!=j)) {
					
				}
			}
		}
	}

	public static void main(String[] args) {
		MaximumSumUnderDivisibilityCondition obj = new MaximumSumUnderDivisibilityCondition();
		System.out.println(Arrays.toString(obj.findSumUnderDivisibilityCondition(new int[] {2, 3, 1, 4, 6, 5})));
	}

}
