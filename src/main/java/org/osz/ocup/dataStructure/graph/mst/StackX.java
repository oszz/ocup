package org.osz.ocup.dataStructure.graph.mst;

/**
 * 栈
 * @author zz
 *
 */
public class StackX {

	private int MAX_SIZE = 20;//数组的大小
	private int[] arr;
	private int top;//栈顶
	
	public StackX(){
		arr = new int[MAX_SIZE];
		top = -1;
	}
	
	
	
	/**
	 * 往栈中压入一个值
	 * @param value
	 */
	public void push(int value){
		arr[++top] = value;
	}
	
	/**
	 * 查看栈顶的值
	 * @return 栈顶的值
	 */
	public int peek(){
		return arr[top];
	}
	
	/**
	 * 弹出栈顶的值
	 * @return 栈顶的值
	 */
	public int pop(){
		return arr[top--];
	}
	
	/**
	 * 判断栈是否为空
	 * @return 为空返回<tt>true<tt>,否则返回<tt>false<tt>
	 */
	public boolean isEmpty(){
		return top == -1;
	}
}
