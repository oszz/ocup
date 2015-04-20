package org.osz.ocup.dataStructure.hash.openAddressMethod.hashAgain;

/**
 * Hash表<br>
 * 开放地址法--再哈希化
 * @author zz
 *
 */
public class HashTable {

	private int size;//最好是一质数
	private DataItem[] itemArr;
	private DataItem nonItem;
	
	public HashTable(int size){
		this.size = size;
		this.itemArr = new DataItem[this.size];
		nonItem = new DataItem(-1);
	}
	
	/**
	 * 哈希化方法
	 * @param key
	 * @return 哈希化后的索引下标
	 */
	public int hashFunc(int key){
		return key % size;
	}
	
	/**
	 * 再哈希化
	 * @param key
	 * @return 根据关键子不同的步长
	 */
	public int hashFunc2(int key){
		return 5 - (key % 5);//5是一个常量，用于再哈希化。该常量是个质数，并且小于哈希表的容量(size)
	}
	
	/**
	 * 显示哈希表的内容
	 */
	public void displayTable(){
		System.out.print("Table: ");
		for(int i=0;i<size;i++){
			if(itemArr[i] != null)
				System.out.print(itemArr[i].getKey() + " ");
			else
				System.out.print("** ");
		}
		System.out.println();
	}
	
	/**
	 * 插入一个数据项
	 * @param item
	 */
	public void insert(DataItem item){
		int key = item.getKey();
		int hashVal = hashFunc(key);
		int stepSize = hashFunc2(key);
		
		while(itemArr[hashVal] != null && itemArr[hashVal].getKey() != -1){
			hashVal += stepSize;
			hashVal %= size;//到达末尾时回转
		}
		
		itemArr[hashVal] = item;
	}
	
	/**
	 * 删除数据项
	 * @param key
	 * @return 返回被删除的数据项，如果不存在，返回 <tt>null<tt>
	 */
	public DataItem delete(int key){
		int hashVal = hashFunc(key);
		int stepSize = hashFunc2(key);
		
		while(itemArr[hashVal] != null){
			if(itemArr[hashVal].getKey() == key){
				DataItem temp = itemArr[hashVal];
				itemArr[hashVal] = nonItem;
				return temp;
			}
			hashVal += stepSize;
			hashVal %= size;//到达末尾时回转
		}
		return null;//不存在，返回 null
	}
	
	/**
	 * 查找数据项
	 * @param key
	 * @return 返回找到的数据项，如果未找到，返回 <tt>null<tt>
	 */
	public DataItem find(int key){
		int hashVal = hashFunc(key);
		int stepSize = hashFunc2(key);
		
		while(itemArr[hashVal] != null){
			if(itemArr[hashVal].getKey() == key){
				return itemArr[hashVal];
			}
			hashVal += stepSize;
			hashVal %= size;//到达末尾时回转
		}
		return null;//不存在，返回 null
	}
	
	
}
