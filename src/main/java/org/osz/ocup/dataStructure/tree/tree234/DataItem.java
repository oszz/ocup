package org.osz.ocup.dataStructure.tree.tree234;

/**
 * 2-3-4树中的数据项
 * @author zz
 *
 */
public class DataItem {

	public long data;
	
	public DataItem(long data){
		this.data = data;
	}
	
	/**
	 * 显示数据项的内容(e.g. /50)
	 */
	public void displayItem(){
		System.out.print("/" + this.data);
	}
}
