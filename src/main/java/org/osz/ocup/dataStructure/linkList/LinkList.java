package org.osz.ocup.dataStructure.linkList;

/**
 * 单链表
 * @author zz
 *
 */
public class LinkList {

	private Link first;
	
	public LinkList(){
		first = null;
	}
	
	/**
	 * 在第一个位置插入一个链接点，之前的first变成了新链接点的next
	 * @param id
	 * @param data
	 */
	public void insertFirst(int id, double data){
		Link newLink = new Link(id, data);
		if(isEmpty()){
			first = newLink;
		}else{
			newLink.next = first;
			first = newLink;
		}
	}
	
	/**
	 * 删除并返回第一个链接点<br>
	 * 之前的first的next链接点变成了first
	 * @return Link
	 */
	public Link removeFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	/**
	 * 判断是否为空
	 * @return boolean
	 */
	public boolean isEmpty(){
		return first == null;
	}
	
	/**
	 * 显示链表中的数据
	 */
	public void displayList(){
		if(!isEmpty()){
			System.out.print("first --> last : ");
			Link current = first;
			while(current != null){
				current.displayLink();
				current = current.next;
			}
			System.out.println();
		}
	}
	
	/**
	 * 根据键值(id)查找Link
	 * @param key
	 * @return Link
	 */
	public Link find(int key){
		if(!isEmpty()){
			Link current = first;
			while(current.iData != key){
				current = current.next;
				if(current == null){
					return null;
				}
			}
			return current;
		}else{
			return null;
		}
	}
	
	/**
	 * 根据键值(id)删除链接点
	 * @param key
	 * @return Link
	 */
	public Link delete(int key){
		if(isEmpty()){
			return null;
		}else{
			Link previous = first;
			Link current = first;
			while(current.iData != key){
				if(current.next == null){
					return null;
				}else{
					previous = current;
					current = current.next;
				}
			}
			if(previous == current){//相等，说明第一个链接点就是将要删除的链接点
				first = first.next;//将第一个连接点指向它身的next(其实就是在第一个链接点被删除后，第二个链接点成为了第一个链接点)
			}else{
				previous.next = current.next; //上一个链接点的next指向当前链接点的next.相当于删除了中间的一个链接点(current)
			}
			return current;
		}
	}
}
