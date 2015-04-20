package org.osz.ocup.dataStructure.tree.tree234;

/**
 * 2-3-4树
 * @author zz
 *
 */
public class Tree234 {

	private Node root = new Node();//根节点
	
	/**
	 * 查找key所在的索引位置
	 * @param key
	 * @return int
	 */
	public int find(long key){
		Node currentNode = root;
		int indexItem = -1;
		while(true){
			if((indexItem = currentNode.findItem(key)) != -1){
				return indexItem;
			}else if(currentNode.isLeaf()){
				return -1;
			}else{
				currentNode = getNextNode(currentNode, key);
			}
		}
	}
	
	/**
	 * 插入一个值
	 * @param value
	 */
	public void insert(long value){
		DataItem newDataItem = new DataItem(value);
		Node currentNode = root;
		while(true){
			if(currentNode.isFull()){
				split(currentNode);
				currentNode = currentNode.getParent();
				currentNode = getNextNode(currentNode, value);
			}else if(currentNode.isLeaf()){
				break;
			}else{
				currentNode = getNextNode(currentNode, value);
			}
		}//循环结束后，currentNode就是要插入的叶节点
		currentNode.insertItem(newDataItem);
	}
	
	/**
	 * 分裂节点（根据2-3-4树的规则进行分裂）
	 * @param thisNode
	 */
	public void split(Node thisNode){
		DataItem itemB;
		DataItem itemC;
		
		Node parent;
		Node child2;
		Node child3;
		
		int itemIndex;
		
		itemC = thisNode.removeItem();
		itemB = thisNode.removeItem();
		
		child2 = thisNode.disconnectChild(2);
		child3 = thisNode.disconnectChild(3);
		
		Node rightNode = new Node();
		
		if(thisNode == root){
			root = new Node();
			parent = root;
			root.connectChild(0, thisNode);
		}else{
			parent = thisNode.getParent();
		}
		itemIndex = parent.insertItem(itemB);
		int n = parent.getNumItems();
		
		for(int j=n-1;j>itemIndex;j--){
			Node temp = parent.disconnectChild(j);
			parent.connectChild(j+1, temp);
		}
		
		parent.connectChild(itemIndex+1, rightNode);
		
		rightNode.insertItem(itemC);
		rightNode.connectChild(0, child2);
		rightNode.connectChild(1, child3);
	}
	
	
	/**
	 * 获得当前节点的key所属范围的子节点
	 * @param currentNode
	 * @param key
	 * @return {@link Node}
	 */
	public Node getNextNode(Node currentNode, long key){
		int numItems = currentNode.getNumItems();
		int i=0;
		for(i=0;i<numItems;i++){
			DataItem di = currentNode.getItem(i);
			if(key < di.data){//如果满足条件，则返回当前索引的子节点
				return currentNode.getChild(i);
			}
		}
		return currentNode.getChild(i);//返回最右边的子节点
	}
	
	/**
	 * 显示树的内容
	 */
	public void displayTree(){
		recDisplayTree(root, 0, 0);
	}
	
	/**
	 * 递归显示树结构
	 * @param thisNode
	 * @param level
	 * @param childNum
	 */
	public void recDisplayTree(Node thisNode, int level, int childNum){
		System.out.print("level=" + level + " child=" + childNum + " ");
		thisNode.displayNode();
		
		int numItems = thisNode.getNumItems();
		
		for(int j=0; j<numItems+1; j++){
			Node nextNode = thisNode.getChild(j);
			if(nextNode != null){
				recDisplayTree(nextNode, level+1, j);
			}else
				return;
			
		}
	}
}
