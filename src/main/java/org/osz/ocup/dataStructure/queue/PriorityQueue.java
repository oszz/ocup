package org.osz.ocup.dataStructure.queue;

/**
 * 优先级队列（不循环）
 * @author Administrator
 *
 */
public class PriorityQueue {

	private int maxSize;
	private long[] arr;
	private int nItems;
	
	public PriorityQueue(int maxSize){
		this.maxSize = maxSize;
		this.arr = new long[maxSize];
		this.nItems = 0;
	}
	
	/**
	 * 按优先级插入数据，在此是按数据大小进行排列(从小到大)
	 * @param value
	 */
	public void insert(long value){
		if(nItems == 0){
			arr[nItems] = value;
		}else{
			int i = 0;
			for(i=nItems-1;i>=0;i--){
				if(value > arr[i]){
					arr[i+1] = arr[i];
				}else{
					break;
				}
			}
			arr[i+1] = value;
		}
		nItems++;
	}
	
	public long peekMin(){
		return arr[nItems - 1];
	}
	
	public boolean isFull(){
		return nItems == maxSize;
	}
	
	public boolean isEmpty(){
		return nItems == 0;
	}
	
	/**
	 * 移除并返回
	 * @return long
	 */
	public long remove(){
		return arr[--nItems];
	}
}
