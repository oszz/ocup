package org.osz.ocup.dataStructure.linkList.stack;

public class LinkStackApp {

	public static void main(String[] args) {
		
		LinkStack ls = new LinkStack();
		
		ls.push(99);
		ls.push(88);
		ls.push(77);
		ls.push(66);
		
		ls.display();
		
		ls.push(55);
		ls.push(44);
		
		ls.display();
		
		ls.pop();
		ls.pop();
		ls.pop();
		ls.pop();
		
		ls.display();
		
		ls.push(33);
		ls.push(22);
		
		ls.display();
		
		
	}
}
