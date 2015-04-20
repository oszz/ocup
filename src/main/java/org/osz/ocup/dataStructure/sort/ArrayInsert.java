package org.osz.ocup.dataStructure.sort;

/**
 * 插入排序
 * @author zz
 *
 */
public class ArrayInsert {

	private long[] arr;
	private int nElem;
	
	public ArrayInsert(int maxSize){
		this.arr = new long[maxSize];
		this.nElem = 0;
	}
	/**
	 * 添加数据
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
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 插入排序
	 */
	public void insertionSort(){
		for(int out=1;out<nElem;out++){
			
			long temp = arr[out];
			int in = out;
			
			while((in > 0) && (arr[in-1] >= temp)){
				arr[in] = arr[in-1];
				in--;
			}
			arr[in] = temp;
		}
	}
	
}
