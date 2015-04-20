package org.osz.ocup.dataStructure.linkList.doublyLink;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insertFirst(66);
		dll.insertFirst(44);
		dll.insertFirst(33);
		dll.insertFirst(22);
		
		dll.displayForword();
		dll.displayBackword();
		
		dll.insertAfter(66, 55);
		
		dll.displayForword();
		dll.displayBackword();
		
		dll.insertLast(77);
		dll.insertLast(88);
		
		dll.displayForword();
		dll.displayBackword();
		
		dll.deleteKey(66);
		dll.deleteKey(22);
		dll.deleteKey(88);
		
		dll.deleteFirst();
		dll.deleteLast();
		
		dll.displayForword();
		dll.displayBackword();
		
		
		dll.insertLast(77);
		dll.insertLast(88);
		
		dll.displayForword();
		dll.displayBackword();
		
	}
}
