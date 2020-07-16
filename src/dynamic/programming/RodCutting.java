package dynamic.programming;


public class RodCutting {
	static int[] price = null;
	static int [] savedArray = null;
	public int cutRod(int price[]) {
		int n = price.length;
		RodCutting.price=price;
		//return calculateMaxRecursive(n);
		
		//Initialized savedArray by -1 for dynamic programming approach
		RodCutting.savedArray = new int[n];
		for(int i = 0; i<n; i++) {
			savedArray[i]=-1;
		}
		return calculateMaxDynamic(n);
	}
	// claculate the max value using recursion
	public int calculateMaxRecursive(int n) {
		int max = price[n-1];
		for(int i = 1; i<=n/2; i++) {
			int leftSideMaxVal = calculateMaxRecursive(i);
			int rightSideMaxVal = calculateMaxRecursive(n-i);
			int thisVal = leftSideMaxVal+rightSideMaxVal;
			max = Math.max(max, thisVal);
		}
		return max;
	}
	//calculate the max value using dynamic programming
	
	public int calculateMaxDynamic(int n) {
		int max = price[n-1];
		for(int i=1; i<=n/2; i++) {
			if(savedArray[i-1]!=-1) {
				int leftSideMaxVal = savedArray[i-1];
				int rightSideMaxVal = calculateMaxDynamic(n-i);
				int thisVal = leftSideMaxVal+rightSideMaxVal;
				max = Math.max(max, thisVal);
			}
			else {
				int leftSideMaxVal = calculateMaxDynamic(i);
				int rightSideMaxVal = calculateMaxDynamic(n-i);
				int thisVal = leftSideMaxVal+rightSideMaxVal;
				savedArray[i-1] = leftSideMaxVal;
				max = Math.max(max, thisVal);
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		RodCutting obj = new RodCutting();
		System.out.println(obj.cutRod(new int[] {3, 5, 8, 9, 10, 17, 17, 20}));

	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  