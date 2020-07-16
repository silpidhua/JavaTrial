package data.structure;

class LLNode{
	public int val1;
	public String val2;
	LLNode pt;
	
	LLNode(String val2,int val1){
		this.val1 = val1;
		this.val2 = val2;
		pt = null;
	}

	@Override
	public String toString() {
		return "LLNode [val1=" + val1 + ", val2=" + val2 + ", pt=" + pt + "]";
	}
	
	
}

public class LinkedListPractice {
	LLNode createLinkedList(String[] city, int[] population) {
		LLNode head = null;
		LLNode nextPt = null;
		for(int i = 0; i<city.length; i++) {
			LLNode nodeObj = new LLNode(city[i], population[i]);
			if(head == null) {
				head = nodeObj;
				nextPt = nodeObj;
			}else {
				nextPt.pt = nodeObj; 
				nextPt = nodeObj;
			}
		}
		return head;
	}
	//Insert a node at the front of the linked list
	LLNode insertFromFront(LLNode head, String city, int population) {
		LLNode node = new LLNode(city, population);
		if(head == null) {
			head = node;
		}
		else {
			node.pt = head;
			head = node;
		}
		return head;
	}
	// Insert a node at the last of licked list
	LLNode insertLastNode(LLNode head, String city, int population) {
		LLNode node = new LLNode(city, population);
		LLNode nextPt = head;
		if(head == null) {
			head = node;
		}else {
			while(nextPt.pt!=null) {
				nextPt = nextPt.pt;
			}
			nextPt.pt = node;
		}
		return head;
	}
	// Delete the first node
	LLNode deleteFirstNode(LLNode head) {
		if(head == null) {
			return null;
		}else {
			head = head.pt;
		}
		return head;
	}
	// Delete the last node
	LLNode deleteLatNode(LLNode head) {
		LLNode nextPt = head;
		LLNode SecondLastPt;
		if(head==null) {
			return null;
		}
		else {
			while(nextPt.pt.pt!=null) {
				SecondLastPt = nextPt;
			}
			nextPt.pt = null;
		}
		return head;
	}
	// find a node
	int countNode(LLNode head) {
		LLNode countNode = head;
		int count = 0;
		if(head!= null) {
			/*count=1;
			while(countNode.pt!=null) {
				System.out.println(count+" "+countNode.pt);
				countNode.pt= countNode.pt.pt;
				count++;
			}*/
			for(count = 1; countNode.pt!=null;countNode.pt= countNode.pt.pt, count=count+1) {
				
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String [] city = new String[] {"Kolkata","Bangalore","Chennai"};
		int[] population = new int[] {123, 234, 345};
		LinkedListPractice obj = new LinkedListPractice();
		LLNode linkedList = obj.createLinkedList(city, population);
		System.out.println(linkedList);
		//System.out.println(obj.insertFromFront(linkedList, "Delhi", 234));
		//System.out.println(obj.insertLastNode(linkedList, "Delhi", 234));
		//System.out.println(obj.deleteFirstNode(linkedList));
		//System.out.println(obj.deleteLatNode(linkedList));
		System.out.println(obj.countNode(linkedList));
	}

}
