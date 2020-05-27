package DynamicProgramming;

import java.util.Arrays;

public class MaximumSumNoTwoAdjacentElements {
	
	
	public int findMaxSum(int[] arr) {
		if(arr.length<2) {
			return arr[0];
		}else if(arr.length==2) {
			return Math.max(arr[0], arr[1]);
		}
		else if(arr.length==3) {
			 int rightSidemax1 = arr[0]+findMaxSum(Arrays.copyOfRange(arr, 2, arr.length));
			 return rightSidemax1;
		}
		else {
			int rightSidemax1 = arr[0]+findMaxSum(Arrays.copyOfRange(arr, 2, arr.length));
			int rightSidemax2 = arr[1]+findMaxSum(Arrays.copyOfRange(arr, 3, arr.length));
			return Math.max(rightSidemax1, rightSidemax2);
		}	
		
	}

	public static void main(String[] args) {
		MaximumSumNoTwoAdjacentElements obj = new MaximumSumNoTwoAdjacentElements();
		System.out.println(obj.findMaxSum(new int[] {1, 2, 3}));
		System.out.println(obj.findMaxSum(new int[] {1, 20, 3}));
		System.out.println(obj.findMaxSum(new int[] {5, 5, 10, 100, 10, 5}));
				

	}

}
