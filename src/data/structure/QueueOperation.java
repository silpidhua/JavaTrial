package data.structure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperation {

	public static void main(String[] args) {
		/*
		 * Being an interface Queue needs concrete class to for the declaration.
		 * And most common classes are PriorityQueue And Linked List
		 * */
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		
		for(int i=0; i<5; i++) {
			q1.add(i);
		}
		System.out.println("Elements of queue:"+q1);
		
		// remove head of the queue
//		int removeEle = q1.remove();
//		System.out.println("Removed element:" + removeEle);
//		System.out.println(q1);
		
		// to view head of the queue
		int head = q1.peek();
		System.out.println("head:"+head);
		System.out.println("q1 size:"+ q1.size());
		
		for(int i =0; i<q1.size(); i++) {
			q2.add(q1.remove());
			
		}
		System.out.println("elements in q2:"+q2);
	}
	

}
