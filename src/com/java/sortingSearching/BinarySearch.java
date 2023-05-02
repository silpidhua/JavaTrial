package com.java.sortingSearching;

import java.util.Arrays;

public class BinarySearch {
	
	int binSearch(int n, int[] arr) {
		
		if(arr[(int) Math.ceil(arr.length/2)]==n) {
			return (int) Math.ceil(arr.length/2);
		}
		else if(arr[(int) Math.ceil(arr.length/2)]>n) {
			binSearch(n, Arrays.copyOfRange(arr,0,(int) Math.ceil(arr.length/2)));
		}
		else if (arr[(int) Math.ceil(arr.length/2)]<n) {
			binSearch(n, Arrays.copyOfRange(arr,(int)Math.ceil(arr.length/2),arr.length));
		}
		return n;
		
	}
	
	public static void main(String args[]) {
		int[] arrays = new int[] {2,3,4,5,6,7,8,9,10};
		BinarySearch obj = new BinarySearch();
		System.out.println(obj.binSearch(6,arrays));
	}

}
