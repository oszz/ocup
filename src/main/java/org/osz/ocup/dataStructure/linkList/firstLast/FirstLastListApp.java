package org.osz.ocup.dataStructure.linkList.firstLast;

public class FirstLastListApp {

	public static void main(String[] args) {
		FirstLastList fll = new FirstLastList();
		
		fll.insertFirst(11);
		fll.insertFirst(22);
		fll.insertFirst(33);
		fll.insertFirst(44);
		fll.insertFirst(55);
		
		fll.displayList();
		
		while(fll.deleteFirst() != null){
			fll.deleteFirst();
		}
		System.out.println(fll.isEmpty());
		
		fll.insertLast(11);
		fll.insertLast(22);
		fll.insertLast(33);
		fll.insertLast(44);
		fll.insertLast(55);
		
		fll.displayList();
		
	}
}
