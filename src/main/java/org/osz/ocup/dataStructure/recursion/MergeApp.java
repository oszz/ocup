package org.osz.ocup.dataStructure.recursion;

/**
 * 归并排序（没有用递归）
 * @author zz
 *
 */
public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = {1,3,6,8,9,10};//已经有序的数组
		int[] arrayB = {2,4,5,7};//已经有序的数组
		int[] arrayC = new int[10];//arrayC的数组长度等于arrayA+arrayB的长度之和。归并排序后的数据放入arrayC
		
		merge(arrayA, 6, arrayB, 4, arrayC);
		displayArray(arrayC);
	}
	
	/**
	 * 归并排序
	 * @param arrayA
	 * @param sizeA
	 * @param arrayB
	 * @param sizeB
	 * @param arrayC
	 */
	public static void merge(int[] arrayA, int sizeA,
							 int[] arrayB, int sizeB,
							 int[] arrayC){
		
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;
		
		while(indexA < sizeA && indexB < sizeB){
			if(arrayA[indexA] < arrayB[indexB]){
				arrayC[indexC++] = arrayA[indexA++];
			}else{
				arrayC[indexC++] = arrayB[indexB++];
			}
		}
		
		while(indexA < sizeA){ //如果arrayA还有剩余元素就全部放入arrayC中
			arrayC[indexC++] = arrayA[indexA++];
		}
		
		while(indexB < sizeB){ //如果arrayB还有剩余元素就全部放入arrayC中
			arrayC[indexC++] = arrayB[indexB++];
		}
	}
	
	/**
	 * 显示数组的内容
	 * @param array
	 */
	public static void displayArray(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
