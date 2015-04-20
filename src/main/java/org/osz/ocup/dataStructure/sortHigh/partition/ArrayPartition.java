package org.osz.ocup.dataStructure.sortHigh.partition;

/**
 * 划分
 * @author zz
 *
 */
public class ArrayPartition {

	private long[] arr;
	private int nElems;
	
	public ArrayPartition(int maxSize){
		this.arr = new long[maxSize];
		this.nElems = 0;
	}
	
	/**
	 * 插入一个值
	 * @param value
	 */
	public void insert(long value){
		arr[nElems++] = value;
	}
	
	/**
	 * 获取数据项的个数
	 * @return int
	 */
	public int size(){
		return nElems;
	}
	
	/**
	 * 显示数组内容
	 */
	public void display(){
		for(int i=0;i<nElems;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 将数组进行划分<br>
	 * 根据关键点（或者叫做枢纽点 privot）将数组分成两个部分：<br>
	 * 1.左边的数据项都比privot小。<br>
	 * 2.右边的数据项都比privot大。
	 * @param left 最左边的索引（也就是下标0的位置）
	 * @param right 最右边的索引（也就是下标nElems-1的位置）
	 * @param privot 关键点（或者叫做枢纽点）
	 * 
	 * @return int 关键点的分隔位置
	 */
	public int partitionIt(int left, int right, long privot){
		int leftPoint = left - 1;//左边的指针点
		int rightPoint = right + 1;//右边的指针点
		while(true){//无限循环，直到leftPtr>=rightPtr时跳出循环
			while(leftPoint < right && arr[++leftPoint] < privot);//从左边开始找，找到大于privot的一个点
			
			while(rightPoint > left && arr[--rightPoint] > privot);//从右边开始找，找到小于privot的一个点
			
			if(leftPoint >= rightPoint){
				break;
			}else{
				swap(leftPoint, rightPoint);
			}
		}
		
		return leftPoint;
	}
	
	/**
	 * 交换两个数据项
	 * @param index1
	 * @param index2
	 */
	public void swap(int index1, int index2){
		long temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
}
