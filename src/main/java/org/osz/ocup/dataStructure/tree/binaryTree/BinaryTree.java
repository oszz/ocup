package org.osz.ocup.dataStructure.tree.binaryTree;

import java.util.Stack;

/**
 * 二叉树
 * @author zz
 *
 */
public class BinaryTree {

	private Node root;
	
	/**
	 * 查找并返回id相同的node,若未找到返回null
	 * @param id
	 * @return Node
	 */
	public Node find(int id){
		Node current = root;
		while(current.id != id){
			if(current.id < id){//当前节点的id小于查找的id,则去右边找，反之去左边找
				current = current.rightNode;
			}else{
				current = current.leftNode;
			}
			
			if(current == null){//如果current为空，说明没有找到id相同的数据项，返回空
				return null;
			}
		}
		return current;
	}
	
	/**
	 * 插入一个节点
	 * @param id
	 * @param data
	 */
	public void insert(int id, double data){
		Node newNode = new Node();
		newNode.id = id;
		newNode.data = data;
		if(root == null){
			root = newNode;
		}else{
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(id < current.id){
					current = current.leftNode;
					if(current == null){
						parent.leftNode = newNode;
						return;
					}
				}else{
					current = current.rightNode;
					if(current == null){
						parent.rightNode = newNode;
						return;
					}
				}
			}
		}
	}
	
	/**
	 * 根据id删除一个节点
	 * @param id
	 * @return boolean
	 */
	public boolean delete(int id){
		Node current = root;
		Node parent = root;
		boolean isLeftNode = false;
		
		while(current.id != id){
			parent = current;
			if(id < current.id){
				isLeftNode = true;
				current = current.leftNode;
			}else{
				isLeftNode = false;
				current = current.rightNode;
			}
			
			if(current == null){//未找到，直接返回null
				return false;
			}
		}//以上为：找到要删除的节点
		
		
		//current 是当前节点（也就是要删除的节点）
		if(current.leftNode == null && current.rightNode == null){//如果current没有子节点的情况
			if(current == root){
				root = null;
			}else if(isLeftNode){
				parent.leftNode = null;
			}else{
				parent.rightNode = null;
			}
		}else if(current.leftNode == null){//current 左子节点为空，右子节点不为空
			if(current == root){
				root = current.rightNode;
			}else if(isLeftNode){
				parent.leftNode = current.rightNode;
			}else{
				parent.rightNode = current.rightNode;
			}
		}else if(current.rightNode == null){//current 右子节点为空，左子节点不为空
			if(current == root){
				root = current.leftNode;
			}else if(isLeftNode){
				parent.leftNode = current.leftNode;
			}else{
				parent.rightNode = current.leftNode;
			}
		}else{//current 左和右子节点都不为空
			Node delNode = current;
			Node successor = getSuccessor(delNode);
			
			if(current == root){
				root = successor;
			}else if(isLeftNode){
				parent.leftNode = successor;
			}else{
				parent.rightNode = successor;
			}
			successor.leftNode = delNode.leftNode;
		}
		return true;
	}
	
	/**
	 * 获得将要删除的节点的继承者节点</br>
	 * 默认将该节点的右子节点的最左端节点 作为该节点的继承者
	 * @param delNode
	 * @return Node
	 */
	private Node getSuccessor(Node delNode){
		
		Node successorParent = delNode;//继承者的父级
		Node successor = delNode;//继承者
		Node current = delNode.rightNode;//从该节点的右子节点开始找其最左端的子节点
		
		while(current != null){
			successorParent = successor;
			successor = current;
			current = current.leftNode;
		}

		if(successor != delNode.rightNode){//如果不是该节点的直接右子节点，则做连接
			successorParent.leftNode = successor.rightNode;
			successor.rightNode = delNode.rightNode;
		}
		return successor;
	}
	
	/**
	 * 遍历树
	 * @param traverseType
	 */
	public void traverse(int traverseType){
		
		switch(traverseType){
			case 1: 
				System.out.println("前序遍历：");
				preorder(root);
				break;
			case 2: 
				System.out.println("中序遍历：");
				inorder(root);
				break;
			case 3: 
				System.out.println("后序遍历：");
				postorder(root);
				break;
		}
	}
	
	/**
	 * 前序遍历
	 * @param localRoot
	 */
	private void preorder(Node localRoot){
		if(localRoot != null){
			System.out.print(localRoot.data + " ");
			preorder(localRoot.leftNode);
			preorder(localRoot.rightNode);
		}
	}
	/**
	 * 中序遍历
	 * @param localRoot
	 */
	private void inorder(Node localRoot){
		if(localRoot != null){
			inorder(localRoot.leftNode);
			System.out.print(localRoot.data + " ");
			inorder(localRoot.rightNode);
		}
	}
	/**
	 * 后序遍历
	 * @param localRoot
	 */
	private void postorder(Node localRoot){
		if(localRoot != null){
			postorder(localRoot.leftNode);
			postorder(localRoot.rightNode);
			System.out.print(localRoot.data + " ");
		}
	}
	
	/**
	 * 显示树的内容
	 */
	public void displayTree(){
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("...................................................");
		while(isRowEmpty == false){
			Stack<Node> localStack = new Stack<Node>();
			isRowEmpty = true;
			
			for(int j=0;j<nBlanks;j++){
				System.out.print(" ");
			}
			
			while(globalStack.isEmpty() == false){
				Node temp = globalStack.pop();
				if(temp != null){
					System.out.print(temp.id);
					localStack.push(temp.leftNode);
					localStack.push(temp.rightNode);
					
					if(temp.leftNode != null || temp.rightNode != null){
						isRowEmpty = false;
					}
				}else{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				
				for(int j=0;j<nBlanks*2-2;j++)
					System.out.print(' ');
			}
			System.out.println();
			
			nBlanks /= 2;
			
			while(localStack.isEmpty() == false){
				globalStack.push(localStack.pop());
			}
		}
		System.out.println("................................................................");
	}
}
