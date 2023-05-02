package data.structure;



public class RotateMatrix {
	
	boolean isRotateRow(int[] row1, int[] row2) {
		String str1 = "";
		String str2 = "";
		for(int i =0; i<row1.length; i++) {
			str1 = str1+row1[i]+"-";
		}
		str1 = str1+str1;
		for(int i =0; i<row2.length; i++) {
			str2 = str2+row2[i]+"-";
		}
		if(str1.indexOf(str2)!=-1) {
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {
		RotateMatrix obj = new RotateMatrix();
		int[][] myMatrix = {{1,2,3},{2,3,1},{3,1,2}};
		boolean isRotate = true;
		for(int i = 1; i<myMatrix.length; i++) {
			boolean isRotateRow = obj.isRotateRow(myMatrix[0], myMatrix[i]);
			if(!isRotateRow) {
				isRotate = false;
			}
		}
		System.out.println(isRotate);

	}

}
