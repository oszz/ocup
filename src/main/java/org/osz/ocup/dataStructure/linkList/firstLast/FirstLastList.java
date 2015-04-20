package org.osz.ocup.dataStructure.linkList.firstLast;

/**
 * 双端链表
 * @author zz
 *
 */
public class FirstLastList {

	private Link first;//链表的头链接点
	private Link last;//链表的尾链接点
	
	public FirstLastList(){
		first = null;
		last = null;
	}
	
	/**
	 * 在第一的位置插入一个链接点
	 * @param value
	 */
	public void insertFirst(long value){
		Link newLink = new Link(value);
		if(isEmpty()){
			last = newLink;
		}else{
			newLink.next = first;
		}
		first = newLink;
	}
	
	/**
	 * 在末尾的位置插入一个链接点
	 * @param value
	 */
	public void insertLast(long value){
		Link newLink = new Link(value);
		if(isEmpty()){
			first = newLink;
		}else{
			last.next = newLink;
		}
		last = newLink;
	}
	
	/**
	 * 删除头链接点
	 * @return Link
	 */
	public Link deleteFirst(){
		if(!isEmpty()){
			Link temp = first;
			if(first.next == null)
				last = null;
			first = first.next;
			return temp;
		}else{
			return null;
		}
	}
	
	/**
	 * 判断是否为空
	 * @return boolean
	 */
	public boolean isEmpty(){
		return first == null;
	}
	
	/**
	 * 显示链表内容
	 */
	public void displayList(){
		if(!isEmpty()){
			Link current = first;
			while(current != null){
				current.displayLink();
				current = current.next;
			}
			System.out.println();
		}
	}
}
