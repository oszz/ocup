package org.osz.ocup.dataStructure.hash.chainAddressMethod;

/**
 * Hash表<br>
 * 链地址法
 * @author zz
 *
 */
public class HashTable {

	public SortedList[] listArr;
	public int size;
	
	public HashTable(int size){
		this.size = size;
		this.listArr = new SortedList[this.size];
		
		for(int i=0;i<size;i++){
			listArr[i] = new SortedList();//填满数组
		}
	}
	
	/**
	 * 哈希化计算
	 * @param key
	 * @return 返回key在哈希表中的索引位置
	 */
	public int hashFunc(int key){
		return key % size;
	}
	
	/**
	 * 插入一个数据项
	 * @param link
	 */
	public void insert(Link link){
		int key = link.data;
		int hashVal = hashFunc(key);
		listArr[hashVal].insert(link);
	}
	
	/**
	 * 删除一个数据项
	 * @param data
	 * 
	 */
	public void delete(int data){
		int hashVal = hashFunc(data);
		listArr[hashVal].delete(data);
	}
	
	/**
	 * 查找数据项
	 * @param data
	 * @return 返回找到的数据项，如果未找到，则返回<tt>null<tt>
	 */
	public Link find(int data){
		int hashVal = hashFunc(data);
		return listArr[hashVal].find(data);
	}
	
	/**
	 * 显示哈希表的内容
	 */
	public void displayTable(){
		System.out.println("Table ");
		for(int i=0;i<size;i++){
			System.out.print(i + "：");
			listArr[i].displayList();
		}
		
	}
}
