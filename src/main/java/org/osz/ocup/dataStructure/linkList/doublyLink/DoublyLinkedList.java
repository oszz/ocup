package org.osz.ocup.dataStructure.linkList.doublyLink;

/**
 * 双向链表
 * @author zz
 *
 */
public class DoublyLinkedList {

	private Link first;
	private Link last;
	
	public DoublyLinkedList(){
		this.first = null;
		this.last = null;
	}
	
	/**
	 * 判断链表是否为空
	 * @return boolean
	 */
	public boolean isEmpty(){
		return this.first == null;
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
			first.previous = newLink;
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
			newLink.previous = last;
		}
		last = newLink;
	}
	
	/**
	 * 在某个链接点后面插入
	 * @param key 在此链接点后插入
	 * @param value 插入的链接点
	 * @return boolean
	 */
	public boolean insertAfter(long key, long value){
		
		
		Link newLink = new Link(value);
		
		Link current = first;
		
		while(current != null && key != current.data){
			current = current.next;
			if(current == null){
				return false;//如果current为空，就不插入新的链接点
			}
		}
		
		if(current == last){
			last = newLink;
		}else{
			current.next.previous = newLink;
			newLink.next = current.next;
		}
		current.next = newLink;
		newLink.previous = current;
		return true;
	}
	
	/**
	 * 删除并返回头链接点
	 * @return Link
	 */
	public Link deleteFirst(){
		if(isEmpty()){
			return null;
		}else{
			Link temp = first;
			if(first.next == null){//如果只有一个元素
				last = null;
			}else{
				first.next.previous = null;
			}
			
			first = first.next;
			
			return temp;
		}
	}
	
	/**
	 * 删除并返回尾链接点
	 * @return Link
	 */
	public Link deleteLast(){
		if(isEmpty()){
			return null;
		}else{
			Link temp = last;
			
			if(last.previous == null){//如果只有一个元素
				first = null;
			}else{
				last.previous.next = null;
			}
			last = last.previous;
			
			return temp;
		}
	}
	
	/**
	 * 删除并返回某个链接点
	 * @param key
	 * @return Link
	 */
	public Link deleteKey(long key){
		if(isEmpty()){
			return null;
		}else{
			
			Link current = first;
			while(current != null && key != current.data){
				current = current.next;
				if(current == null){
					return null;
				}
			}
			if(current == first){
				first = first.next;
			}else{
				current.previous.next = current.next;
			}
			if(current == last){
				last = last.previous;
			}else{
				current.next.previous = current.previous;
			}
			
			return current;
		}
	}
	
	/**
	 * 从前往后挨个显示
	 */
	public void displayForword(){
		System.out.print("DoublyLinked first-->last : ");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	/**
	 * 从前往后挨个显示
	 */
	public void displayBackword(){
		System.out.print("DoublyLinked last-->first : ");
		Link current = last;
		while(current != null){
			current.displayLink();
			current = current.previous;
		}
		System.out.println();
	}
	
}
