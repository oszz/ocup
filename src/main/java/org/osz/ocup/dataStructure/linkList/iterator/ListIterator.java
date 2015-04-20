package org.osz.ocup.dataStructure.linkList.iterator;

/**
 * 链表的迭代器
 * @author zz
 *
 */
public class ListIterator {
	
	private LinkList ourList; 
	
	private Link current;
	private Link previous;

	public ListIterator(LinkList linkList){
		this.ourList = linkList;
		reset();
	}
	
	/**
	 * 重置链表
	 */
	public void reset(){
		this.current = ourList.getFirst();
		this.previous = null;
	}
	
	/**
	 * 是否到达链表的结尾
	 * @return boolean
	 */
	public boolean atEnd(){
		return current.next == null;
	}
	
	/**
	 * 进入下一个链接点
	 */
	public void nextLink(){
		previous = current;
		current = current.next;
	}
	
	/**
	 * 获得当前的链接点
	 * @return
	 */
	public Link getCurrent(){
		return current;
	}
	
	/**
	 * 在当前链接点后方插入一个链接点，并将当前链接点指向新插入的链接点
	 * @param value
	 */
	public void insertAfert(long value){
		Link newLink = new Link(value);
		
		if(ourList.isEmpty()){
			ourList.setFirst(newLink);
			reset();
		}else{
			newLink.next = current.next;
			current.next = newLink;
			
			nextLink();
		}
	}
	
	/**
	 * 在当前链接点前方插入一个链接点，并将当前链接点指向新插入的链接点
	 * @param value
	 */
	public void insertBefore(long value){
		Link newLink = new Link(value);
		if(ourList.isEmpty()){
			ourList.setFirst(newLink);
			reset();
		}else if(previous == null){
			newLink.next = current;
			ourList.setFirst(newLink);
			reset();
		}else{
			previous.next = newLink;
			newLink.next = current;
			
			current = newLink;
		}
	}
	
	/**
	 * 删除并返回当前的链接点
	 * @return Link
	 */
	public Link deleteCurrent(){
		if(ourList.isEmpty()){
			return null;
		}else if(previous == null){ //判断current是否是头链接点
			ourList.setFirst(current.next);
			reset();
		}else{
			previous.next = current.next;
			if(atEnd()){
				reset();
			}else{
				current = current.next;
			}
		}
		return current;
	}
	
}
