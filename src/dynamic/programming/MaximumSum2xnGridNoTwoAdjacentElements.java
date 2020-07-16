/*Maximum sum in a 2 x n grid such that no two elements are adjacent*/
package dynamic.programming;

import java.util.Arrays;

public class MaximumSum2xnGridNoTwoAdjacentElements {
	public int findMax2XnGrid(int[][] arr) {
			int colSize = arr[0].length;
			if(colSize==0) {
				return 0;
			}else if(colSize==1) {
				return Math.max(arr[0][0],arr[1][0]);
			}else if(colSize==2) {
				int arr0 = Math.max(arr[0][0], arr[0][1]);
				int arr1 = Math.max(arr[1][0], arr[1][1]);
				return Math.max(arr0, arr1);
			}else if(colSize==3) {
				int[] arr1 = Arrays.copyOfRange(arr[0],2, colSize);
				int[] arr2 = Arrays.copyOfRange(arr[1],2, colSize);
				int [][] arrNew = new int[2][colSize-2];
				arrNew[0] = arr1;
				arrNew[1] = arr2;
				int arrRet = Math.max(arr[0][0],arr[1][0]) + findMax2XnGrid(arrNew);
				return arrRet;
			}else {
				int[] arr1 = Arrays.copyOfRange(arr[0],2, colSize);
				int[] arr2 = Arrays.copyOfRange(arr[1],2, colSize);
				int [][] arrNew1 = new int[2][colSize-2];
				arrNew1[0] = arr1;
				arrNew1[1] = arr2;
				int[] arr3 = Arrays.copyOfRange(arr[0],3, colSize);
				int[] arr4 = Arrays.copyOfRange(arr[1],3, colSize);
				int [][] arrNew2 = new int[2][colSize-3];
				arrNew2[0] = arr3;
				arrNew2[1] = arr4;
				int arrRet1 = Math.max(arr[0][0],arr[1][0]) + findMax2XnGrid(arrNew1);
				int arrRet2 = Math.max(arr[0][1],arr[1][1]) + findMax2XnGrid(arrNew2);
				return Math.max(arrRet1, arrRet2);
			}
	}
	public static void main(String[] args) {
		MaximumSum2xnGridNoTwoAdjacentElements obj = new MaximumSum2xnGridNoTwoAdjacentElements();
		System.out.println(obj.findMax2XnGrid(new int[][]{{ 1, 2, 3, 4, 5}, { 6, 7, 8, 9, 10}}));

	}

}
