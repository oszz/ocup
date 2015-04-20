package org.osz.ocup.dataStructure.hash.openAddressMethod.linearDetection;

/**
 * Hash表<br>
 * 开放地址法--线性探测
 * @author zz
 *
 */
public class HashTable {

	private int size;
	private DataItem[] itemArr;
	private DataItem nonItem;//表示空的数据项
	
	public HashTable(int size){
		this.size = size;
		itemArr = new DataItem[this.size];
		nonItem = new DataItem(-1);//默认-1表示是空的数据项
	}
	
	/**
	 * hash化计算数据项在数组中的索引下标
	 * @param key
	 * @return 索引下标
	 */
	public int hashFunc(int key){
		return key % this.size;
	}
	
	/**
	 * 根据key查找数据项
	 * @param key
	 * @return 和key值匹配的数据项
	 */
	public DataItem find(int key){
		int hashIndex = hashFunc(key);
		
		while(itemArr[hashIndex] != null && itemArr[hashIndex].getKey() != -1){
			if(itemArr[hashIndex].getKey() == key){
				return itemArr[hashIndex];
			}
			hashIndex++;
			hashIndex %= size;//保证hashIndex都结尾时，环绕到1的位置重新查找
		}
		return null;
	}
	
	/**
	 * 插入一个数据项
	 * @param item 要插入的数据项
	 */
	public void insert(DataItem item){
		int key = item.getKey();
		int hashIndex = hashFunc(key);
		
		while(itemArr[hashIndex] != null && itemArr[hashIndex].getKey() != -1){
			hashIndex++;
			hashIndex %= size;//保证hashIndex都结尾时，环绕到1的位置重新查找
		}
		itemArr[hashIndex] = item;
	}
	
	/**
	 * 根据key删除数据项
	 * @param key
	 * @return 删除的数据项
	 */
	public DataItem delete(int key){
		int hashIndex = hashFunc(key);
		while(itemArr[hashIndex] != null && itemArr[hashIndex].getKey() != -1){
			if(itemArr[hashIndex].getKey() == key){
				DataItem temp = itemArr[hashIndex];
				itemArr[hashIndex] = nonItem;
				return temp;
			}
			hashIndex++;
			hashIndex %= size;//保证hashIndex都结尾时，环绕到1的位置重新查找
		}
		return null;
	}
	
	/**
	 * 显示hash表里的内容
	 */
	public void displayTable(){
		System.out.print("Table: ");
		for(int i=0;i<size;i++){
			
			if(itemArr[i]!= null){
				System.out.print(itemArr[i].getKey() + " ");
			}else{
				System.out.print("** ");
			}
		}
		System.out.println();
	}
}
