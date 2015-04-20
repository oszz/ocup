package org.osz.ocup.dataStructure.linkList.doublyLink;

/**
 * 双向连接点
 * @author zz
 *
 */
public class Link {

	public long data;
	public Link previous;//上一个链接点
	public Link next;//下一个链接点
	
	public Link(long data){
		this.data = data;
	}
	
	/**
	 * 显示链接点内容
	 */
	public void displayLink(){
		System.out.print(this.data+" ");
	}
}
