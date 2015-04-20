package org.osz.ocup.dataStructure.linkList.queue;

/**
 * 双端链表（用于实现队列）
 * @author zz
 *
 */
public class FirstLastList {

	private Link first;
	private Link last;
	
	public FirstLastList(){
		this.first = null;
		this.last = null;
	}
	
	/**
	 * 在队尾插入一个值
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
	 * 删除并返回第一个链接点
	 * @return Link
	 */
	public long deleteFirst(){
		if(isEmpty()){
			return -1;//这个值有待商榷
		}else{
			Link temp = first;
			first = first.next;
			
			return temp.data;
		}
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
