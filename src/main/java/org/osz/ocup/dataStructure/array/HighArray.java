package org.osz.ocup.dataStructure.array;

/**
 * 高级数组操作
 * @author zz
 *
 */
public class HighArray {

	private long[] arr;
	private int numEles = 0;//数组中元素的个数
	
	public HighArray(int size){
		arr = new long[size];
	}
	
	/**
	 * 查找一个数
	 * @param searchKey
	 * @return boolean
	 */
	public boolean find(long searchKey){
		int j=0;
		for(j=0;j<numEles;j++){
			if(arr[j] == searchKey){
				break;
			}
		}
		if(j == numEles)
			return false;
		
		return true;
	}
	
	/**
	 * 在队末插入一个值
	 * @param value
	 */
	public void insert(long value){
		arr[numEles] = value;
		numEles++;
	}
	
	/**
	 * 删除一个值，并把这个值后面的值往前移一位
	 * @param delKey
	 * @return boolean
	 */
	public boolean delete(long delKey){
		int j=0;
		for(j=0;j<numEles;j++){
			if(arr[j] == delKey){
				break;
			}
		}
		if(j == numEles){
			return false;
		}else{
			for(int k=j;k<numEles;k++){
				arr[k] = arr[k+1];
			}
			numEles--;
			return true;
		}
	}
	
	/**
	 * 显示当前数组中的值
	 */
	public void display(){
		for(int j=0;j<numEles;j++){
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
	
	/**
	 * 返回数组中最大的数据，如果数组为空则返回-1
	 * @return long
	 */
	public long getMaxKey(){
		if(numEles == 0)//数组为空
			return -1;
		else{
			long maxKey = arr[0]; //初始化一个最大的key
			for(int i=0;i<numEles;i++){
				if(maxKey < arr[i]){
					maxKey = arr[i];
				}
			}
			return maxKey;
		}
	}
	
	/**
	 * 删除最大数据值
	 */
	public void removeMaxKey(){
		long maxKey = getMaxKey();
		delete(maxKey);
	}
	
}
