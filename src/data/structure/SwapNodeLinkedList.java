package data.structure;

class SLNode{
	String city;
	SLNode pt;
	public SLNode(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "SLNode [city=" + city + ", pt=" + pt + "]";
	}
}
public class SwapNodeLinkedList {
	
	SLNode createLinedList(String[] city) {
		SLNode head = null;
		SLNode nextPt = null;
		for(int i = 0; i<city.length; i++) {
			SLNode node = new SLNode(city[i]);
			if(head == null) {
				head = node;
				nextPt = node;
			}else {
				nextPt.pt = node;
				nextPt = node;
			}
		}
		return head;
	}
	
	SLNode swapLinkedListByVal(SLNode head, String val1, String val2) {
		
		// Search for x (keep track of prevX and CurrX) 
		SLNode prevX = null, currX = head, temp = null;
		while(currX!= null && !currX.city.equals(val1)){
			prevX = currX;
			currX = currX.pt;
		}
		// Search for y (keep track of prevY and currY) 
		SLNode prevY = null, currY = head;
		while(currY!= null && !currY.city.equals(val2) ){
			prevY = currY;
			currY = currY.pt;
		}
		// If x is not head of linked list 
		if(prevX != null) {
			prevX.pt = currY;
		}
		// If x is head of linked list 
		else {
			head = currY;
		}
		// If y is not head of linked list 
		if(prevY!=null) {
			prevY.pt = currX;
		}// If y is head of linked list 
		else {
			head = currX;
		}
		// Swap next pointers
		temp = currX.pt;
		currX.pt = currY.pt;
		currY.pt = temp;
		
		return head;
	}
	/*void swapLinkedListByPos(SLNode head, int pos1, int pos2) {
		
		SLNode prevX = null, currX = head, temp = null;
		while(currX!= null && currX.city!= pos1){
			prevX = currX;
			currX = currX.pt;
		}
		SLNode prevY = null, currY = head;
		while(currY!= null && currY.city!= pos2){
			prevY = currY;
			currY = currY.pt;
		}
		temp = currX.pt;
		currX.pt = currY.pt;
		currY.pt = temp;
		prevX.pt = currY;
		prevY.pt = currX;
		
	}*/
	
	public static void main(String[] args) {
		
		SwapNodeLinkedList obj = new SwapNodeLinkedList();
		String[] city = new String[] {"Kolkata","Bangalore","Chennai","Delhi","Mumbai","Hyderabad","Pune"};
		SLNode  linkedList = obj.createLinedList(city); 
		System.out.println(linkedList);
		linkedList = obj.swapLinkedListByVal(linkedList, "Kolkata", "Delhi");
		System.out.println(linkedList);
	}

}
