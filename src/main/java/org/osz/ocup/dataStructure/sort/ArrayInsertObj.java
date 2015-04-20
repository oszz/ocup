package org.osz.ocup.dataStructure.sort;

/**
 * 对象的插入排序
 * @author zz
 *
 */
public class ArrayInsertObj {

	private Person[] arr;
	private int nElem;
	
	public ArrayInsertObj(int maxSize){
		this.arr = new Person[maxSize];
		nElem = 0;
	}
	
	/**
	 * 存入一个人员对象
	 * @param first
	 * @param last
	 * @param age
	 */
	public void insert(String first, String last, int age){
		arr[nElem] = new Person(first, last, age);
		nElem++;
	}
	
	/**
	 * 显示数组中的人员
	 */
	public void display(){
		for(int i=0;i<nElem;i++){
			System.out.println(arr[i]);
		}
	}
	
	/**
	 * 对数组的人员按lastName进行排序（lastName字典大小顺序）
	 */
	public void insertionSort(){
		for(int out=1;out<nElem;out++){
			Person temp = arr[out];
			int in = out;
			while((in > 0) && (arr[in-1].getLast().compareTo(temp.getLast()) >= 0)){
				arr[in] = arr[in - 1];
				in--;
			}
			
			arr[in] = temp;
			
		}
		
	}
	
	
	
}
