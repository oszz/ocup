package org.osz.ocup.dataStructure.linkList;

/**
 * 链表中的链接点
 * @author zz
 *
 */
public class Link {

	public int iData;//id
	public double dData;//数据
	public Link next;//下一个链接点
	
	public Link(int id, double data){
		this.iData = id;
		this.dData = data;
	}
	
	/**
	 * 显示链接点的内容
	 */
	public void displayLink(){
		System.out.print("{" + iData + " , " + dData + "} ");
	}
}
