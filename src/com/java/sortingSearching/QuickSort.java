package com.java.sortingSearching;

public class QuickSort {
	
	int[] qucikSort(int[] arr, int low, int high){
		if(low<high) {
			int pi = partition(arr, low, high);
			qucikSort(arr, low, pi-1);
			qucikSort(arr, pi+1,high );
		}
		
		return arr;
		
	}
	int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low; j<high; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {2,5,1,7,6,8};
		int n = arr.length;
		QuickSort obj = new QuickSort();
		arr = obj.qucikSort(arr, 0, n-1);
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]+"");
		}

	}

}
