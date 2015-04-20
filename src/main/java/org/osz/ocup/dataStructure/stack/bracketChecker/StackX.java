package org.osz.ocup.dataStructure.stack.bracketChecker;

/**
 * 字符栈
 * @author zz
 *
 */
public class StackX {

	private int maxSize;
	private char[] arr;
	private int top;
	
	public StackX(int maxSize){
		this.arr = new char[maxSize];
		this.top = -1;
	}
	
	/**
	 * 存入
	 * @param value
	 */
	public void push(char value){
		arr[++top] = value;
	}
	
	/**
	 * 弹出
	 * @return char
	 */
	public char pop(){
		return arr[top--];
	}
	
	/**
	 * 查看栈顶数据
	 * @return char
	 */
	public char peek(){
		return arr[top];
	}
	
	/**
	 * 查看栈是否满
	 * @return boolean
	 */
	public boolean isFull(){
		return top == (maxSize - 1);
	}
	
	/**
	 * 查看栈是否为空
	 * @return boolean
	 */
	public boolean isEmpty(){
		return top == -1;
	}
}
