package org.osz.ocup.dataStructure.sortHigh.quickSort;

/**
 * 快速排序之一<br>
 * 快速排序是基于划分算法，以及递归方法的使用
 * @author zz
 *
 */
public class ArrayQuickSort1 {

	
	private long[] arr;
	private int nElems;
	
	public ArrayQuickSort1(int maxSize){
		this.arr = new long[maxSize];
		this.nElems = 0;
	}
	
	/**
	 * 插入一个数据
	 * @param value
	 */
	public void insert(long value){
		arr[nElems++] = value;
	}
	
	/**
	 * 返回数组中数据项的数目
	 * @return
	 */
	public int size(){
		return nElems;
	}
	
	/**
	 * 显示数组内容
	 */
	public void display(){
		System.out.println("arr: ");
		for(int i=0;i<nElems;i++){
			System.out.print(arr[i] + " ");
			
			if(i%100 == 0 && i != 0){
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
		if(left >= right){
			return;
		}else{
			long privot = arr[right];//默认将最右边的数据项做为关键点（枢纽privot）
			
			int partitionIt = partitionIt(left, right, privot);//关键点所在位置
			
			recQuickSort(left, partitionIt - 1);//对左边的数组再次进行快速排序
			
			recQuickSort(partitionIt + 1, right);//对右边的数组再次进行快速排序
		}
	}
	
	/**
	 * 返回划分处的位置（划分算法）
	 * @param left
	 * @param right
	 * @param privot 
	 * @return int 关键点（枢纽）的位置
	 */
	private int partitionIt(int left, int right, long privot){
		int leftPoint = left - 1;//左边指针
		int rightPoint = right;//右边指针(注：最右边的数据其实就是枢纽关键点,不用对它进行划分)
		while(true){
			while(arr[++leftPoint] < privot);//得到左边数组大于关键点（privot）的数据项位置。
											//没有检测leftPoint的范围（leftPoint<right）,因为不管怎样，leftPoint总会停在最右端枢纽的位置，
											//这样就做到减少检测，提高代码效率
			while(rightPoint > 0 && arr[--rightPoint] > privot);//得到右边数组大于关键点（privot）的数据项位置
											//这里目前还必须检测rightPoint的范围（rightPoint > 0）
			
			if(leftPoint >= rightPoint){
				break;
			}else{
				swap(leftPoint, rightPoint);
			}
		}
		swap(leftPoint, right);//交换枢纽关键点与划分处的数据项
		
		return leftPoint;
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
	
}
