package interview.question;

public class GoldMineProblem {
	
	//declare an 2d array
	int maxArr[][]= null;
	public int findGoldAmount(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		
		//Initialize the 2 d array with -1 and the size is same of given array
		maxArr= new int[row][col];
		for(int i = 0; i<row; i++) {
			for(int j =0; j<col; j++) {
				maxArr[i][j] = -1;
			}
		}
		//call the recursion function
		int max = 0;
		for(int i = 0; i<row; i++) {
			int maxVal = findMaxRecurrsive(arr,i,0);
			max = Math.max(maxVal, max);
		}
		return max;
	}
	public int findMaxRecurrsive(int arr[][], int i,int j) {
		int row = arr.length;
		int col = arr[0].length;
		if(j == col-1) {
			return arr[i][j];
		}else {
			if(maxArr[i][j]!=-1) {
				return maxArr[i][j];
			}else {
				if(i==0) {
					int temp1 = (arr[i][j]+findMaxRecurrsive(arr, i+1, j+1));
					int temp2 = (arr[i][j]+findMaxRecurrsive(arr,i,j+1));
					int temp3 = Math.max(temp1, temp2); 
					maxArr[i][j] = temp3;
					return temp3;
				}else if (i== row-1) {
					int temp1 = (arr[i][j]+findMaxRecurrsive(arr, i-1, j+1));
					int temp2 = (arr[i][j]+findMaxRecurrsive(arr, i, j+1));
					int temp3 = Math.max(temp1, temp2);
					maxArr[i][j] = temp3;
					return temp3;
				}else {
					int temp1 = (arr[i][j]+findMaxRecurrsive(arr, i+1, j+1));
					int temp2 =  (arr[i][j]+findMaxRecurrsive(arr,i,j+1));
					int temp3 = (arr[i][j]+findMaxRecurrsive(arr, i-1, j+1));
					int temp4 = Math.max(temp1, temp2);
					int temp5 = Math.max(temp3, temp4);
					maxArr[i][j] = temp5;
					return temp5;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		GoldMineProblem obj = new GoldMineProblem();
		int gold[][]= {{10, 33, 13, 15},
                {22, 21, 04, 1},
                {5, 0, 2, 3},
                {0, 6, 14, 2}};
		System.out.println(obj.findGoldAmount(gold));
	}

}
