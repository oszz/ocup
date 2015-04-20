package org.osz.ocup.dataStructure.linkList.queue;

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
	 * 显示链接点的内容
	 */
	public void displayLink(){
		System.out.print(data+" ");
	}
}
