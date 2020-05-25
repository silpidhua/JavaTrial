package com.java.acct;

public class FibonacciSeries {
	
	//find value of nth position of fibonacci series
	public int findFiboValRec(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		else {
			return findFiboValRec(n-1)+findFiboValRec(n-2);
		}
	}
	
	// print fibonacci series till nth position
	static int n1=0,n2=1,n3=0;
	public void printFiboSeries(int n) {
		for(int i=0; i<=n; i++) {
			System.out.println(findFiboValRec(i));
		}
		
	}	
	//return value of nth position of fibonacci series
	int[] savedArr = null;
	public int findFiboDynamic(int n) {
		savedArr = new int[n+1];
		for(int i=0; i<=n; i++) {
			savedArr[i] = -1;
		}
		return findFiboValDynamic(n);
	}
	public int findFiboValDynamic(int n) {
		int returnVal = -1;
		if(savedArr[n]!=-1) {
			returnVal = savedArr[n];
		}else {
			if(n==0) {
				returnVal= 0;
			}else if(n==1) {
				returnVal= 1;
			}
			else {
				returnVal = findFiboValDynamic(n-1)+findFiboValDynamic(n-2);
			}
			savedArr[n]= returnVal;
		}
		return returnVal;
	}
	

	public static void main(String[] args) {
		FibonacciSeries obj = new FibonacciSeries();
		System.out.println(obj.findFiboDynamic(9));
//		obj.printFiboSeries(9);
	}

}
