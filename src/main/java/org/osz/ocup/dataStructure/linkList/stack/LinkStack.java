package org.osz.ocup.dataStructure.linkList.stack;

/**
 * 用链表实现的栈
 * @author zz
 *
 */
public class LinkStack {

	private LinkList linkList;
	
	public LinkStack(){
		linkList = new LinkList();
	}
	
	/**
	 * 往栈中压入一个数据
	 * @param value
	 */
	public void push(long value){
		linkList.insertFirst(value);
	}
	
	/**
	 * 从栈中弹出一个数据
	 * @return Link
	 */
	public Link pop(){
		return linkList.deleteFirst();
	}
	
	/**
	 * 判断栈是否为空
	 * @return boolean
	 */
	public boolean isEmpty(){
		return linkList.isEmpty();
	}
	
	/**
	 * 显示栈中的数据（从栈顶到栈底）
	 */
	public void display(){
		System.out.print("Stack  top-->bottom : ");
		linkList.displayList();
	}
}
