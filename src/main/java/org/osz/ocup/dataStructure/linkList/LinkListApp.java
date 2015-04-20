package org.osz.ocup.dataStructure.linkList;

public class LinkListApp {

	public static void main(String[] args) {
		LinkList ll = new LinkList();
		
		ll.insertFirst(1, 1.1);
		ll.insertFirst(2, 2.2);
		ll.insertFirst(3, 3.3);
		ll.insertFirst(5, 5.5);
		ll.insertFirst(4, 4.4);
		
		ll.displayList();
		
	
		/*
		while(!ll.isEmpty()){
			Link delLink = ll.removeFirst();
			
			delLink.displayLink();
			System.out.println(" is Deleted !" );
			
			ll.displayList();
		}
		*/
		
		Link lf = ll.find(2);
		lf.displayLink();
		System.out.println();
		
		Link ld = ll.delete(3);
		ld.displayLink();
		System.out.println();
		
		ll.displayList();
	}
}
