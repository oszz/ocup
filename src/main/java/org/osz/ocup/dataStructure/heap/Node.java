package org.osz.ocup.dataStructure.heap;

/**
 * 堆的节点类
 * @author zz
 *
 */
public class Node {

	private int data;
	
	public Node(int data){
		this.data = data;
	}

	public int getKey() {
		return data;
	}
	public void setKey(int data) {
		this.data = data;
	}
	
}
