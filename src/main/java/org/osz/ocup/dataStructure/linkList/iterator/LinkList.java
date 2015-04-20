package org.osz.ocup.dataStructure.linkList.iterator;

/**
 * 链表
 * @author zz
 *
 */
public class LinkList {

	private Link first;
	
	
	public LinkList(){
		first = null;
	}
	
	/**
	 * 获得一个链表迭代器对象
	 * @return ListIterator
	 */
	public ListIterator getIterator(){
		return new ListIterator(this);
	}
	
	/**
	 * 获得头链接点
	 * @return Link
	 */
	public Link getFirst(){
		return first;
	}
	
	/**
	 * 设置头链接点
	 * @param first
	 */
	public void setFirst(Link first){
		this.first = first;
	}
	
	/**
	 * 判断链表是否为空
	 * @return boolean
	 */
	public boolean isEmpty(){
		return first == null;
	}
	
	/**
	 * 显示链表的内容
	 */
	public void displayList(){
		System.out.print("LinkList  first-->last : ");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		
		System.out.println();
	}
}
