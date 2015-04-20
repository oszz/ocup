package org.osz.ocup.dataStructure.queue;

public class QueueApp {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
		queue.remove();
		
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		
		
		//queue.insert(40);
		//queue.insert(50);
		
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
	}
}
