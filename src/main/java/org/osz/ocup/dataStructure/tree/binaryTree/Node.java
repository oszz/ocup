package org.osz.ocup.dataStructure.tree.binaryTree;

/**
 * 树的节点
 * @author zz
 *
 */
public class Node {

	public int id;
	public double data;
	public Node leftNode;
	public Node rightNode;
	
	public void dispalyNode(){
		System.out.print("{" + id +", " + data + "} ");
	}
}
