package com.java.sortingSearching;

public class SelectionSort {
	
	public int[] selectionSort(int[] arr) {
		
		for(int i = 0; i<arr.length-1; i++) {
			int min_idx = i;
			for(int j = i+1; j<arr.length; j++ ) {
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
					int temp = arr[min_idx];
					arr[min_idx] = arr[i];
					arr[i]= temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {6,7,3,4,9,10};
		SelectionSort obj = new SelectionSort();
		arr = obj.selectionSort(arr);
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
