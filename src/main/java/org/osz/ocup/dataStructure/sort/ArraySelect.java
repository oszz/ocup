package org.osz.ocup.dataStructure.sort;

/**
 * 选择排序
 * @author zz
 *
 */
public class ArraySelect {
	private long[] arr;
	private int nElem;
	
	public ArraySelect(int maxSize){
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
	 * 选择排序(与冒泡排序相比，减少了交换的次数)
	 */
	public void selectionSort(){
		int minIn; 
		for(int i=0;i<nElem;i++){
			minIn = i;
			for(int j=i;j<nElem;j++){
				if(arr[j] < arr[minIn])
					minIn = j;
			}
			swap(minIn, i);
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
