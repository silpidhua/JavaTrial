package interview.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SecondLargestNumber {
	public int secondLargestTreeSet(int[] arr) {
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i = 0; i<arr.length; i++) {
			ts.add(arr[i]);
		}
		System.out.println(ts.lower(ts.last()));
		return 0;
	}
	
	public int secondLargest(int[] arr ) {
		int largest = -999999999;
		int secondLargest = -999999999;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>secondLargest && arr[i]<largest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
		
	}

	public static void main(String[] args) {
		SecondLargestNumber obj = new SecondLargestNumber();
		System.out.println(obj.secondLargest(new int[] {1,-2,-10}));

	}

}
