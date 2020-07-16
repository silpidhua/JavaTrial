package data.structure;

class RLNode{
	String city;
	RLNode pt;
	public RLNode(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "RLNode [city=" + city + ", pt=" + pt + "]";
	}
}
public class ReverseLinkedList {
	
	RLNode createLinedList(String[] city) {
		RLNode head = null;
		RLNode nextPt = null;
		for(int i = 0; i<city.length; i++) {
			RLNode node = new RLNode(city[i]);
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
	
	RLNode reverseLinkedList(RLNode head) {
		while()
	}
	public static void main(String[] args) {
		
		ReverseLinkedList obj = new ReverseLinkedList();
		String[] city = new String[] {"Kolkata","Bangalore","Chennai"};
		System.out.println(obj.createLinedList(city));
	}

}
