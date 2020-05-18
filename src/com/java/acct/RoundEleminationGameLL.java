package com.java.acct;

class Node123{
	boolean val;
	char abc;
	Node123 nR;
	//Node123 nL;
	Node123(boolean val, Node123 nR, char abc){
		this.val=val;
		this.nR = nR;
		this.abc = abc;
	}
	public Node123 getNR() {
		return this.nR;
	}
	public void setNR(Node123 argNR) {
		this.nR = argNR;
	}
	
	public boolean getVal() {
		return this.val;
	}
	public void setVal(boolean argVal) {
		this.val = argVal;
	}
}
public class RoundEleminationGameLL {
	
	int solution(int n, int k) {
		// creating linked list
		Node123 head = null;
		Node123 movingTail = null;
		for(int i =n-1; i>=0; i--) {
			Node123 nodeObj = new Node123(true, movingTail, (char)(65+i));
			movingTail = nodeObj;
		}
		head = movingTail;
		
		//cretaing circular linkedlist
		Node123 movingTail2 = movingTail.getNR();
		while(movingTail2!= null) {
			movingTail = movingTail.getNR();
			movingTail2 = movingTail2.getNR();
		}
		movingTail.setNR(head);
		
		//start the game
		for(int i = 0; i<n-1; i++) {
			Node123 pos = head;
			int kPos = 0;
			while(true) {
				if(kPos == k-1) {
					pos.setVal(false);
					break;
				}
				if(pos.getVal() == true) {
					pos= pos.getNR();
					kPos++;
				}
				if(pos.getVal() == false) {
					pos= pos.getNR();
				}
			}
		}
		int finalPos = 0;
		Node123 nodePos= head;
		while(nodePos.getVal()==false) {
			nodePos=nodePos.getNR();
			finalPos++;
		}
		return finalPos+1;
	}
	public static void main(String[] args) {
		RoundEleminationGameLL obj = new  RoundEleminationGameLL();
		System.out.println(obj.solution(4, 6));

	}

}
