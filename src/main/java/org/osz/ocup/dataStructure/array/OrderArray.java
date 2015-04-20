package org.osz.ocup.dataStructure.array;

/**
 * 有序数组的操作
 * @author zz
 *
 */
public class OrderArray {

	private long[] arr;
	private int nElem;
	
	public OrderArray(int size){
		arr = new long[100];
		nElem = 0;
	}
	
	/**
	 * 返回数组中元素的个数
	 * @return int 元素的个数
	 */
	public int size(){
		return nElem;
	}
	
	/**
	 * 插入元素，并且在插入点之后的元素向后移一位
	 * @param value
	 * @return boolean
	 */
	public boolean insert(long value){
		int j = 0;
		for(j=0;j<nElem;j++)
			if(arr[j] > value)
				break;
		
		for(int k=nElem;k > j;k--){
			arr[k] = arr[k-1];
		}
		arr[j] = value;
		nElem++;
		
		return true;
	}
	/**
	 * 查找某元素是数组中的位置索引（二分查找）
	 * @param searchKey
	 * @return int searchKey是数组中的索引
	 */
	public int find(long searchKey){
		int lowerBound = 0;
		int upperBound = nElem - 1;
		int curIn = 0;
		
		while(true){
			curIn = (lowerBound + upperBound)/2;
			
			if(arr[curIn] == searchKey){
				return curIn;
			}else if(lowerBound > upperBound){
				return nElem;//nElem是数组元素的长度，如果返回nElem，arr此索引出是没有值的，也就是说无效的
			}else{
				if(arr[curIn] > searchKey){
					upperBound = curIn - 1;
				}else{
					lowerBound = curIn + 1;
				}
			}
		}
	}
	
	/**
	 * 删除某个值，并且将删除元素所在位置的后面的元素向前移动一位
	 * @param delKey
	 * @return boolean
	 */
	public boolean delete(long delKey){
		int j = find(delKey);
		if(j == nElem){
			return false;
		}else{
			for(int k=j;k<nElem;k++){
				arr[k] = arr[k+1];
			}
			nElem--;
			return true;
		}
	}
	
	/**
	 * 显示数组中所有的元素
	 */
	public void display(){
		for(int i=0;i<nElem;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
