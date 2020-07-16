package dynamic.programming;

public class matrixRowRotationCheck {
	
	boolean isRotatedArray(int row1[], int row2[]) {
		String str1 = "", str2= "", str3="";
		for(int i =0; i<row1.length; i++) {
			str1 = str1+row1[i]+"-";
		}
		str2 = str1+str1;
		for(int i =0; i<row2.length; i++) {
			str3 =str3+ row2[i]+"-";
		}
		
		if(str2.indexOf(str3)!=-1) {
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {
		matrixRowRotationCheck obj = new matrixRowRotationCheck();
		int[][] myMatrix = {{1,2,3},{2,3,1},{3,1,2}};
		
		boolean allArryRotate = true;
		 for(int i =1; i<myMatrix.length; i++) {
			 boolean isRotated = obj.isRotatedArray(myMatrix[0], myMatrix[i]);
			 if(!isRotated) {
				 allArryRotate = false;
			 }
		 }
		 System.out.println(allArryRotate);
		
	}

}
