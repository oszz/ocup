package org.osz.ocup.dataStructure.graph.bfs;

/**
 * 队列<br>
 * 用于图的广度优先搜索
 * @author zz
 *
 */
public class Queue {

	private int SIZE = 20;
	private int[] arr;
	private int front;//头
	private int rear;//尾
	
	public Queue(){
		arr = new int[SIZE];
		front = 0;
		rear = -1;
	}
	
	/**
	 * 在队列尾部插入一个值
	 * @param value 插入的值
	 */
	public void insert(int value){
		if(rear == SIZE - 1){
			rear = -1;
		}
		arr[++rear] = value;
	}
	
	/**
	 * 移除头部的值
	 * @return 头部的值
	 */
	public int remove(){
		int temp = arr[front++];
		if(front == SIZE){
			front = 0;
		}
		return temp;
	}
	
	/**
	 * 判断队列是否为空
	 * @return 为空返回<tt>true<tt>,否则返回<tt>false<tt>
	 */
	public boolean isEmpty(){
		return (rear+1 == front || front+SIZE-1 == rear);
	}
}
