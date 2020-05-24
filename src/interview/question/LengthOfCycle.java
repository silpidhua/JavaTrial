/*25.	Write a program to find the length of cycle from startindex. Given integers where each element points to 
 the  index of the next element how would you detect if there is a cycle in this array?  
  Eg.arr = [1,2,0] . startindex  is 0 arr[0] =1 ->arr[1]=2--arr[2] = 0--arr[0] = again 1 Cycle completed .
  So the length of the Cycle is 3
*/
package interview.question;

import java.util.ArrayList;
import java.util.Arrays;

class CalculateLengthOfCycle {
	
	// check if a true value is present in array
	public boolean checkTrue(boolean[] arr) {
		for(int i =0; i<arr.length;i++) {
			if((arr[i])==true) {
				return true;
			}
		}return false;
	}
	//return the position of first true value in array
	public int checkFirstTrue(boolean[] arr) {
		for(int i =0; i<arr.length;i++) {
			if((arr[i])==true) {
				return i;
			}
		}return -1;
	}
	public int findLength(int arr[]) {
		// length of the array
		boolean[] mark = new boolean[arr.length];
		ArrayList<Integer> al = new ArrayList<Integer>();
		//set boolean True to each element of array mark 
		for(int i = 0; i<mark.length; i++) {
			 mark[i] = (boolean) true; 
		}
		
		int startPos = 0;
		int maxLength = 0;
		while(checkTrue(mark)) {
			if(arr[startPos]<arr.length) {
				al.add(startPos);
				mark[startPos] = false;
				startPos = arr[startPos];
				if(al.contains(startPos)) {
					int tempLenght = al.size()-al.indexOf(startPos);
					if(tempLenght>maxLength) {
						maxLength = tempLenght;
					}
					al.clear();
					startPos = checkFirstTrue(mark);
				}
			}
			else {
				mark[startPos] = false;
				startPos = checkFirstTrue(mark);
				al.clear();
			}
		}
		return maxLength;
	}
}

public class LengthOfCycle {

	public static void main(String[] args) {
		CalculateLengthOfCycle obj = new CalculateLengthOfCycle();
		//System.out.println(obj.findLength(new int[] { 1, 2, 0 }));
		//System.out.println(obj.findLength(new int[] { 1, 2, 0, 5, 81, 97 }));

		//System.out.println(obj.findLength(new int[] { 87, 2, 3, 1, 5, 81, 97 }));
		System.out.println(obj.findLength(new int[] { 87, 2, 3, 1, 5, 81, 97, 9, 54, 11, 56, 13,7,12,88,76,0}));
		
		/*boolean[] mark = new boolean[23];
		mark[21]= true;
		System.out.println(obj.checkFirstTrue(mark));*/
	}

}
