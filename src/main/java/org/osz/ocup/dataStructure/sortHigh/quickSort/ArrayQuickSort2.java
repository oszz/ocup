package org.osz.ocup.dataStructure.sortHigh.quickSort;

/**
 * 快速排序之二<br>
 * 通过寻找中值法，更合理的进行数组划分
 * @author zz
 *
 */
public class ArrayQuickSort2 {

	private long[] arr;
	private int nElems;
	
	public ArrayQuickSort2(int maxSize){
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
	 * 返回数组大小
	 * @return int
	 */
	public int size(){
		return nElems;
	}
	
	/**
	 * 显示数组的内容
	 */
	public void display(){
		System.out.println("arr: ");
		for(int i=0;i<nElems;i++){
			System.out.print(arr[i] + " ");
			if(i%100 ==0 && i !=  0){
				System.out.println();
			}
		}
		System.out.println();
	}
	
	/**
	 * 快速排序
	 */
	public void quickSort(){
		recQuickSort(0, nElems - 1);
	}
	
	/**
	 * 执行快速排序（递归方法）
	 * @param left
	 * @param right
	 */
	private void recQuickSort(int left, int right){
		int size = right - left + 1;
		if(size <= 3){//如果数组大小小于3，就对其进行手工排序
			manualSort(left, right);
		}else{
			long median = medianOf3(left, right);//得到枢纽值（也就是关键点的值）
			
			int partition = partitionIt(left, right, median);//得到划分处的位置
			
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}
	
	/**
	 * 对大小小于3的数组进行手工排序
	 * @param left
	 * @param right
	 */
	private void manualSort(int left, int right){
		int size = right - left + 1;
		if(size <= 1){
			return ;
		}else if(size == 2){
			if(arr[left] > arr[right])
				swap(left, right);
		}else{
			if(arr[left] > arr[right - 1]){//比较左边和中间的值
				swap(left, right - 1);
			}
			if(arr[left] > arr[right]){//比较左边和右边的值
				swap(left, right);
			}
			if(arr[right - 1] > arr[right]){//比较中间和右边的值
				swap(right - 1, right);
			}
		}
	}
	
	/**
	 * 交换两个位置的数据项
	 * @param index1
	 * @param index2
	 */
	private void swap(int index1, int index2){
		long temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	/**
	 * 返回数组的左边、中间、右边3值中的中间值，并对这三个数据项进行排序,最后将中值放到right-1的位置<br>
	 * @param left
	 * @param right
	 * @return long 枢纽（关键点）
	 */
	private long  medianOf3(int left, int right){
		int middle = (right + left)/2;
		if(arr[left] > arr[middle]){//比较左边和中间的值
			swap(left, middle);
		}
		if(arr[left] > arr[right]){//比较左边和右边的值
			swap(left, right);
		}
		if(arr[middle] > arr[right]){//比较中间和右边的值
			swap(middle, right);
		}
		swap(middle, right-1);//将枢纽放到右边right-1
		return arr[right-1];
	}
	
	/**
	 * 返回划分处的位置
	 * @param left
	 * @param right
	 * @param privot 
	 * @return int 划分处的位置
	 */
	private int partitionIt(int left, int right, long privot){
		int leftPoint = left;
		int rightPoint = right - 1;
		
		while(true){
			while(arr[++leftPoint] < privot);//在执行medianOf3方法后，最右边的值肯定大于privot，所以不必检测leftPoint是否越界
			while(arr[--rightPoint] > privot);//在执行medianOf3方法后，最左边的值肯定小于privot，所以在此也不必检测rightPoint是否越界
			
			if(leftPoint >= rightPoint){
				break;
			}else{
				swap(leftPoint, rightPoint);
			}
		}
		swap(leftPoint, right-1);//重置枢纽
		return leftPoint;
	}
	
	
}
