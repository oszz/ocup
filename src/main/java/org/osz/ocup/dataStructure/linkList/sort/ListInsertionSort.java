package org.osz.ocup.dataStructure.linkList.sort;

/**
 * 链表的插入排序(目前对无序的数组进行排序)
 * @author zz
 *
 */
public class ListInsertionSort {

	
	private Link first;
	
	public ListInsertionSort(){
		this.first = null;
	}
	
	/**
	 * 对无序的数组进行插入排序（从小到大）
	 * @param listArr
	 */
	public ListInsertionSort(Link[] listArr){
		this.first = null;
		for(int i=0;i<listArr.length;i++){
			insert(listArr[i]);
		}
	}
	
	/**
	 * 插入一个链接点(排序从小到大)
	 * @param link
	 */
	public void insert(Link link){
		Link previous = null;
		Link current = first;
		while(current != null && link.data > current.data){
			previous = current;
			current = current.next;
		}
		
		if(previous == null){
			first = link;
		}else{
			previous.next = link;
		}
		link.next = current;
	}
	
	/**
	 * 移除并返回头链接点
	 * @return Link
	 */
	public Link remove(){
		if(first == null){
			return null;
		}
		Link temp = first;
		first = first.next;
		return temp;
	}
}
