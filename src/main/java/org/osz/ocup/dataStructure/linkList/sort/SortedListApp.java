package org.osz.ocup.dataStructure.linkList.sort;

public class SortedListApp {

	public static void main(String[] args) {
		
		SortedList sl = new SortedList();
		
		sl.insert(66);
		sl.insert(33);
		sl.insert(99);
		sl.insert(88);
		
		sl.displayList();
		
		sl.remove();
		sl.remove();
		
		sl.displayList();
		
		sl.insert(11);
		sl.insert(77);
		sl.insert(22);
		
		sl.displayList();
	}
}
