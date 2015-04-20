package org.osz.ocup.dataStructure.hash.openAddressMethod.linearDetection;

/**
 * 数据项
 * @author zz
 *
 */
public class DataItem {

	private int data;
	
	public DataItem(int data){
		this.data = data;
	}
	
	/**
	 * 获得数据值
	 * @return 返回此数据项的关键数据值key
	 */
	public int getKey(){
		return this.data;
	}
}
