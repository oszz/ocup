package org.osz.ocup.dataStructure.stack;

/**
 * 栈(用数组模拟栈)
 * @author Administrator
 *
 */
public class StackX {

	private int maxSize;//栈的最大空间
	private long[] arr;//数组模拟的栈
	private int top;//栈顶
	
	public StackX(int maxSize){
		this.maxSize = maxSize;
		this.arr = new long[maxSize];
		top = -1;
	}
	
	/**
	 * 入栈
	 * @param value
	 */
	public void push(long value){
		arr[++top] = value;//top先加一，然后赋值
	}
	
	/**
	 * 出栈
	 * @return long
	 */
	public long pop(){
		return arr[top--];//先弹出数据，top再减一
	}
	/**
	 * 栈是否满
	 * @return boolean
	 */
	public boolean isFull(){
		return (top == maxSize-1);
	}
	
	/**
	 * 栈是否为空
	 * @return boolean
	 */
	public boolean isEmpty(){
		return top == -1;
	}
}
