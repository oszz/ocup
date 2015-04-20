package org.osz.ocup.dataStructure.linkList.sort;

/**
 * 有序链表
 * @author zz
 *
 */
public class SortedList {

	private Link first;
	
	public SortedList(){
		first = null;
	}
	
	/**
	 * 插入一个链接点，有序的（从小到大）
	 * @param value
	 */
	public void insert(long value){
		Link newLink = new Link(value);
		
		Link previous = null;
		Link current = first;
		while((current != null) && (value > current.data)){
			previous = current;
			current = current.next;
		}
		
		if(previous == null){
			first = newLink;
		}else{
			previous.next = newLink;
		}
		newLink.next = current;
		
	}
	
	/**
	 * 判断链表是否为空
	 * @return boolean
	 */
	public boolean isEmpty(){
		return first == null;
	}
	
	/**
	 * 删除并返回头链接点
	 * @return Link
	 */
	public Link remove(){
		if(isEmpty()){
			return null;
		}else{
			Link temp = first;
			first = first.next;
			
			return temp;
		}
	}
	
	/**
	 * 显示链表内容
	 */
	public void displayList(){
		System.out.print("SortedList front-->rear : ");
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
