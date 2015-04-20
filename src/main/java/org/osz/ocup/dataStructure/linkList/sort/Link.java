package org.osz.ocup.dataStructure.linkList.sort;

/**
 * 链接点
 * @author zz
 *
 */
public class Link {

	public long data;
	public Link next;
	
	public Link(long data){
		this.data = data;
	}
	
	/**
	 * 显示链接点内容
	 */
	public void displayLink(){
		System.out.print(data+" ");
	}
}
