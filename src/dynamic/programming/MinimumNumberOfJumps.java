package dynamic.programming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class MinimumNumberOfJumps {
	
	// find minimum jump to reach end using recursion
	public int minJump(int[] arr) {
		System.out.println("Solving problem "+ Arrays.toString(arr));
		if(arr[0]>=arr.length) {
			System.out.println("Result of problem "+Arrays.toString(arr) + " is 1.");
			return 1;
		}else {
			int min = Integer.MAX_VALUE;
			for(int i = 1; i<=arr[0];i++) {
				int thisJump = minJump(Arrays.copyOfRange(arr, i, arr.length));
				min = Math.min(min, thisJump);
			}

			System.out.println("Result of problem "+Arrays.toString(arr) + " is "+ (min+1)+".");
			return min+1;
		}
	}
	
	// find minimum jump to reach end using recursion and dynamic programming
	private int[] savedArray = null;
	public int minJumpDynamic(int arr[]) {
		int n = arr.length;
		savedArray = new int[n];
		Arrays.fill(savedArray,-1);
		return findMinJumpDynamic(arr,0);
		}
	
	public int findMinJumpDynamic(int arr[], int i) {
		System.out.println("Solving problem "+ Arrays.toString(arr)+ " at position "+i);
		if(arr[i]>=arr.length-i) {
			System.out.println("Terminal result of problem "+Arrays.toString(arr) + " at position "+i+" is 1.");
			return 1;
		}else {
			int min = Integer.MAX_VALUE;
			for(int j = i+1; j<=arr[i]+i;j++) {
				if(savedArray[j]!=-1) {
					System.out.println("reading from savedArray "+Arrays.toString(savedArray) +" at position "+j);
					int thisJump = savedArray[j];
					min = Math.min(min, thisJump);
				}else {
					int thisJump = findMinJumpDynamic(arr,j);
					savedArray[j] = thisJump;
					System.out.println("writing to savedArray "+Arrays.toString(savedArray)+" at position "+j);
					min = Math.min(min, thisJump);
				}
			}
			System.out.println("Result of problem "+Arrays.toString(arr) + " at position "+i + " is "+ (min+1)+".");
			return min+1;
		}
		
	}
	public static void main(String[] args) {
		MinimumNumberOfJumps obj = new MinimumNumberOfJumps();
		//System.out.println(obj.minJump(new int[]{ 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 }));
		System.out.println(obj.minJumpDynamic(new int[] { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 }));

	}

}
