package org.osz.ocup.dataStructure.sort;

/**
 * 数组冒泡排序
 * @author zz
 *
 */
public class ArrayBubble {

	private long[] arr;
	private int nElem;
	
	public ArrayBubble(int maxSize){
		this.arr = new long[maxSize];
		this.nElem = 0;
	}
	
	/**
	 * 返回元素的个数
	 * @return int
	 */
	public int size(){
		return nElem;
	}
	
	/**
	 * 插入数据
	 * @param value
	 */
	public void insert(long value){
		arr[nElem] = value;
		nElem++;
	}
	
	/**
	 * 显示数据
	 */
	public void display(){
		for(int i=0;i<nElem;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * 冒泡排序
	 */
	public void bubbleSort(){
		for(int i=nElem-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(arr[j] > arr[j+1])
					swap(j, j+1);
			}
		}
	}
	
	/**
	 * 交换数据
	 * @param one 
	 * @param two
	 */
	private void swap(int one, int two){
		long temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}
	
	
}
