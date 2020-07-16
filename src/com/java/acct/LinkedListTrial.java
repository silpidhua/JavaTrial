package com.java.acct;

class Node{
	public int val1;
	public String val2;
	Node pt;
	
	Node(String val2,int val1){
		this.val1 = val1;
		this.val2 = val2;
		pt = null;
	}
	@Override
	public String toString() {
		return "Node [val1=" + val1 + ", val2=" + val2 + ", pt=" + pt + "]";
	}
}

public class LinkedListTrial {
	
	Node createLinkedList(String[] city, int[] population){
		Node head = null;
		Node movingPt = null;
		for(int i =0; i<city.length; i++) {
			Node nodeObj = new Node(city[i], population[i]);
			if(head == null) {
				head = nodeObj;
				movingPt = nodeObj;
			}
			else {
				movingPt.pt = nodeObj;
				movingPt = nodeObj;
			}
		}
		return head;
	}
	
	//Insert a node at the front of the linked list
	Node insertFirstNode(Node headPt, String city, int population) {
		Node newNode = new Node(city, population);
		newNode.pt = headPt;
		headPt = newNode;
		return headPt;
	}
	//Insert a node in last of linked list 
	Node insertLastNode(Node headPt, String city, int population) {
		Node newNode = new Node(city, population);
		Node lastNode = headPt;
		if(headPt == null) {
			headPt = newNode;
		}else {
			while(lastNode.pt!=null) {
				lastNode = lastNode.pt;
			}
			lastNode.pt = newNode;
		}
		return headPt;
	}
	// Remove first node from the linked list
	Node removeFirstNode(Node headPt) {
		if (headPt == null) 
            return null;
		//Node temp = headPt;
		headPt = headPt.pt;
		return headPt;
	}
	// Remove Last node from the linked list
	Node removeLastNode(Node headPt) {
		Node secondlast_node = headPt;
		// if the first node is null or if there is only one node
		if (headPt == null || headPt.pt == null) {
			 return null;
		}
		//Find the second last node and change its pointer to null
		else {
			while(secondlast_node.pt.pt!=null) {
				secondlast_node = secondlast_node.pt;
			}
			secondlast_node.pt = null;
			return headPt;
		}
	}
	public static void main(String[] args) {
		String[] city =  new String[]{"Bangalore","Kolkata","Delhi","Mumbai","Chennai"};
		int[] population = new int[] {123,234,345,567,678};
		LinkedListTrial obj = new LinkedListTrial();
		Node linkednode = obj.createLinkedList(city, population);
		System.out.println("Creating linkedlist:"+linkednode);
		//System.out.println("Insert a node at the front of the linked list: "+obj.addNode(linkednode, "Pune", 109));
		//System.out.println("Remove a node from the front of the linked list: "+obj.removeFirstNode(linkednode));
		//System.out.println("Remove Last node from the linked list: "+obj.removeLastNode(linkednode));
		System.out.println("Insert a node in last of linked list: "+obj.insertLastNode(linkednode, "Hyderabad", 387));
	}

}
