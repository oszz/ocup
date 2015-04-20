package org.osz.ocup.dataStructure.linkList.queue;

public class LinkQueueApp {

	public static void main(String[] args) {
		LinkQueue lq = new LinkQueue();
		
		lq.insert(11);
		lq.insert(22);
		lq.insert(33);
		lq.insert(44);
		
		lq.displayQueue();
		
		lq.insert(55);
		lq.insert(66);
		
		lq.displayQueue();
		
		lq.remove();
		lq.remove();
		lq.remove();
		lq.remove();
		
		lq.displayQueue();
		
		lq.insert(77);
		lq.insert(88);
		
		lq.displayQueue();
		
	}
}
