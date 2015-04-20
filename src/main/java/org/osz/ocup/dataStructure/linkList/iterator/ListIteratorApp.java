package org.osz.ocup.dataStructure.linkList.iterator;

public class ListIteratorApp {

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		
		ListIterator lIter = linkList.getIterator();
		
		lIter.insertAfert(11);
		lIter.insertAfert(22);
		lIter.insertAfert(33);
		lIter.insertAfert(99);
		
		linkList.displayList();
		
		lIter.insertBefore(88);
		lIter.insertBefore(77);
		lIter.insertBefore(66);
		
		linkList.displayList();
		
		Link dLink = lIter.deleteCurrent();
		dLink.displayLink();
		System.out.println();
		
		linkList.displayList();
		
		
		lIter.reset();
		lIter.insertAfert(112);
		
		lIter.reset();
		lIter.insertBefore(110);
		
		lIter.reset();
		lIter.deleteCurrent();
		
		linkList.displayList();
		
		// 以下是使用迭代器方式显示链表内容
		lIter.reset();
		Link link = lIter.getCurrent();
		link.displayLink();
		while(!lIter.atEnd()){
			lIter.nextLink();
			Link cLink = lIter.getCurrent();
			cLink.displayLink();
		}
		
	}
}
