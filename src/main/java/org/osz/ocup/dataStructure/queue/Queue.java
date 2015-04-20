package org.osz.ocup.dataStructure.queue;

/**
 * 队列（循环队列）
 * @author zz
 *
 */
public class Queue {

	private int maxSize;
	private long[] arr;
	private int front;//队头
	private int rear;//队尾
	private int nItems;//大小
	
	public Queue(int s){
		this.maxSize = s;
		this.arr = new long[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	/**
	 * 插入队尾
	 * @param value
	 */
	public void insert(long value){
		if(rear == maxSize-1){
			rear = -1;
		}
		arr[++rear] = value;
		nItems++;
	}
	
	/**
	 * 移除队头
	 * @return long
	 */
	public long remove(){
		long temp = arr[front++];
		
		if(front == maxSize){
			front = 0;
		}
		
		nItems--;
		return temp;
	}
	
	/**
	 * 查看队头
	 * @return long
	 */
	public long peek(){
		return arr[front];
	}
	
	/**
	 * 是否满
	 * @return boolean
	 */
	public boolean isFull(){
		return nItems == maxSize;
	}
	
	/**
	 * 是否为空
	 * @return boolean
 	 */
	public boolean isEmpty(){
		return nItems == 0;
	}
	
	/**
	 * 返回队列大小
	 * @return int
	 */
	public int size(){
		return nItems;
	}
}
