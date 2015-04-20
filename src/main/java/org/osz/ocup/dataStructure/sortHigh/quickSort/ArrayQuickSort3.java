package org.osz.ocup.dataStructure.sortHigh.quickSort;

/**
 * 快速排序之三<br>
 * 对小于10的数组进行插入排序
 * @author zz
 *
 */
public class ArrayQuickSort3 {

	private long[] arr;
	private int nElems;
	
	public ArrayQuickSort3(int maxSize){
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
	 * 执行快速排序，对大小小于10的数组进行插入排序
	 * @param left
	 * @param right
	 */
	private void recQuickSort(int left, int right){
		int size = right - left + 1;
		if(size < 10){
			insertionSort(left, right);
		}else{
			long median = medianOf3(left, right);
			
			int partition = partitionIt(left, right, median);
			
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}
	
	/**
	 * 找到最左边、中间、最右边三个值中的中值，并返回
	 * @param left
	 * @param right
	 * @return long 枢纽关键点的值
	 */
	private long medianOf3(int left, int right){
		int middle = (left + right)/2;
		
		if(arr[left] > arr[middle]){
			swap(left, middle);
		}
		if(arr[left] > arr[right]){
			swap(left, right);
		}
		if(arr[middle] > arr[right]){
			swap(middle, right);
		}
		swap(middle, right - 1);//将枢纽放到右边
		return arr[right - 1];
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
			while(arr[++leftPoint] < privot);
			while(arr[--rightPoint] > privot);
			
			if(leftPoint >= rightPoint){
				break;
			}else{
				swap(leftPoint, rightPoint);
			}
		}
		
		swap(leftPoint, right - 1);
		
		return leftPoint;
	}
	
	
	/**
	 * 插入排序
	 * @param left
	 * @param right
	 */
	private void insertionSort(int left, int right){
		int size = right - left + 1;
		int out = 0;
		int in = 0;
		for(out=left+1;out<size;out++){
			long temp = arr[out];
			in = out;
			
			while(in > left && arr[in-1] > temp){ //循环结束后in的位置就是temp位置
				arr[in] = arr[in-1];
				in--;
			}
			arr[in] = temp;
		}
	}
}
