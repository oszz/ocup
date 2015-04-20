package org.osz.ocup.dataStructure.queue;

public class PriorityQueueApp {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(10);
		
		pq.insert(50);
		pq.insert(20);
		pq.insert(90);
		pq.insert(10);
		pq.insert(30);
		
		System.out.println(pq.peekMin());
		
		while(!pq.isEmpty()){
			System.out.print(pq.remove()+" ");
		}
	}
}
