package org.osz.ocup.dataStructure.linkList.stack;

/**
 * 链表（用模拟栈的实现）
 * @author zz
 *
 */
public class LinkList {

	private Link first;
	
	public LinkList(){
		first = null;
	}
	
	/**
	 * 在第一的位置插入一个链接点
	 * @param value
	 */
	public void insertFirst(long value){
		Link newLink = new Link(value);
		if(isEmpty()){
			first = newLink;
		}else{
			newLink.next = first;
			first = newLink;
		}
	}
	
	/**
	 * 删除并返回第一个链接点（头链接点）
	 * @return Link
	 */
	public Link deleteFirst(){
		if(!isEmpty()){
			Link temp = first;
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
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
