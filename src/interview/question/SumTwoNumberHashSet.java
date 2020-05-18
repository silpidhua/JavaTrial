package interview.question;

import java.util.HashMap;

public class SumTwoNumberHashSet {
	
	public boolean solution(int[] arr, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i =0; i<arr.length; i++) {
			if(hm.get(arr[i])==null) {
				hm.put(arr[i], 1);
			}
			else {
				hm.put(arr[i],(hm.get(arr[i]))+1);
			}
		}
		for(int i =0; i<arr.length; i++) {
			if(target > arr[i]) {
				int diff = target-arr[i];
				if(diff==arr[i] && hm.get(diff)>=2) {
					return true;
				}
				else if(diff!=arr[i] && hm.containsKey(diff)){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		SumTwoNumberHashSet obj = new SumTwoNumberHashSet();
		System.out.println(obj.solution(new int[] {1,2,3,4,7}, 15));
		
	}

}
