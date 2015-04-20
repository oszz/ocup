package org.osz.ocup.dataStructure.hash.chainAddressMethod;

/**
 * 链表节点
 * @author zz
 *
 */
public class Link {

	public int data;
	public Link next;
	
	public Link(int data){
		this.data = data;
	}
	
	/**
	 * 显示链表节点的内容
	 */
	public void displayLink(){
		System.out.print(this.data + " ");
	}
}
