package com.java.sortingSearching;
// best case timecomplexity O(n)
// Worst and average case complexity O(n*n)
public class BubbleSort {
	
	public int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			
			for(int j = 0; j<n-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {5,6,3,4,7,1};
		BubbleSort obj = new BubbleSort();
		arr = obj.bubbleSort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
