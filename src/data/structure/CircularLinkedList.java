package data.structure;

class CLNode{
	String city;
	CLNode pt;
	
	public CLNode(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "CLNode [city=" + city + ", pt=" + pt + "]";
	}
}
public class CircularLinkedList {
	
	CLNode createLinedList(String[] city) {
		CLNode head = null;
		CLNode nextPt = null;
		for(int i = 0; i<city.length; i++) {
			CLNode node = new CLNode(city[i]);
			if(head == null) {
				head = node;
				nextPt = node;
			}else {
				nextPt.pt = node;
				nextPt = node;
			}
		}
		nextPt.pt = head;
		return head;
	}
	
	
	public static void main(String[] args) {
		
		CircularLinkedList obj = new CircularLinkedList();
		String[] city = new String[] {"Kolkata","Bangalore","Chennai"};
		//System.out.println(obj.createLinedList(city));
	}

}
