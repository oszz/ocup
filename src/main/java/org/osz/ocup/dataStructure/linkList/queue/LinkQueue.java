package org.osz.ocup.dataStructure.linkList.queue;

/**
 * 用链表实现的队列
 * @author zz
 *
 */
public class LinkQueue {

	private FirstLastList firstLastList;
	
	public LinkQueue(){
		this.firstLastList = new FirstLastList();
	}
	
	/**
	 * 向队列中插入一个值（默认是在队尾插入）
	 * @param value
	 */
	public void insert(long value){
		this.firstLastList.insertLast(value);
	}
	
	/**
	 * 删除并返回队列的第一个值（队列头的值）
	 * @return long
	 */
	public long remove(){
		return this.firstLastList.deleteFirst();
	}
	
	/**
	 * 判断队列是否为空
	 * @return boolean
	 */
	public boolean isEmpty(){
		return this.firstLastList.isEmpty();
	}
	
	/**
	 * 显示队列的内容
	 */
	public void displayQueue(){
		System.out.print("Queue  front-->rear : ");
		this.firstLastList.displayList();
	}
}
