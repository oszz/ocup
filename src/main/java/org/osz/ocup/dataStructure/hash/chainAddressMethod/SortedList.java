package org.osz.ocup.dataStructure.hash.chainAddressMethod;

/**
 * 有序的链表
 * @author zz
 *
 */
public class SortedList {

	private Link first;
	
	public SortedList(){
		first = null;
	}
	
	/**
	 * 插入一个数据项
	 * @param data
	 */
	public void insert(Link newLink){
		int data = newLink.data;
		
		Link previous = null;
		Link currentLink = first;
		
		
		while(currentLink != null){
			if(data > currentLink.data){
				previous = currentLink;
				currentLink = currentLink.next;
			}else{
				break;
			}
		}
		if(previous == null){
			newLink.next = first;
			first = newLink;
		}else{
			previous.next = newLink;
			newLink.next = currentLink;
		}
	}
	
	/**
	 * 删除一个数据项
	 * @param key
	 * @return 返回删除的数据项，如果不存在，则返回<tt>null<null>
	 */
	public Link delete(int key){
		Link previous = null;
		Link currentLink = first;
		
		
		while(currentLink != null){
			if(key != currentLink.data){
				previous = currentLink;
				currentLink = currentLink.next;
			}else{
				if(previous == null){
					first = first.next;
				}else{
					previous.next = currentLink.next;
				}
				return currentLink;
			}
		}
		
		return null;
	}
	
	/**
	 * 查找数据项
	 * @param key
	 * @return 返回找到的数据项，如果未找到，则返回<tt>null<tt>
	 */
	public Link find(int key){
		Link currentLink = first;
		
		while(currentLink != null){
			if(key != currentLink.data){
				currentLink = currentLink.next;
			}else{
				return currentLink;
			}
		}
		return null;
	}
	
	/**
	 * 显示链表的内容
	 */
	public void displayList(){
		System.out.print("List(first-->last): ");
		Link currentLink = first;
		while(currentLink != null){
			System.out.print(currentLink.data + " ");
			currentLink = currentLink.next;
		}
		System.out.println();
	}
}
