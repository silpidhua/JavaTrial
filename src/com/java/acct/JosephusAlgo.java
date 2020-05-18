package com.java.acct;

public class JosephusAlgo {
	
	int josephus(int n,int k) {
		if (n==1) {
			return 1;
		}
		else {
			return ((josephus(n - 1, k) + k-1) % n + 1);
		}
	}
public static void main(String[] args) {
	JosephusAlgo obj = new JosephusAlgo();
	System.out.println(obj.josephus(3,6));
	}

}
