package org.osz.ocup.dataStructure.tree.tree234;

/**
 * 2-3-4树的节点
 * @author zz
 *
 */
public class Node {

	private final static int ORDER = 4;//
	private int numItems = 0;//数据项的个数
	private Node parent;//父节点
	private Node[] childArray = new Node[ORDER];//子节点的数组
	private DataItem[] dataItems = new DataItem[ORDER - 1];//数据项的数组
	
	
	/**
	 * 在childArray中的第childNum位置连接子节点childNode;<br>
	 * 并且将childNode的父节点指向该节点
	 * @param childNum 位置
	 * @param childNode 子节点
	 */
	public void connectChild(int childNum, Node childNode){
		childArray[childNum] = childNode;
		if(childNode != null){
			childNode.parent = this;//将childNode的父节点指向该节点
		}
	}
	
	/**
	 * 废除childArray的第childNum位置的子节点;<br>
	 * 并返回该子节点
	 * @param childNum 位置
	 * @return {@link Node} 废除的子节点
	 */
	public Node disconnectChild(int childNum){
		Node childNode = childArray[childNum];
		childArray[childNum] = null;
		return childNode;
	}
	
	/**
	 * 返回childArray的第childNum位置的子节点;
	 * @param childNum 位置
	 * @return {@link Node} 子节点
	 */
	public Node getChild(int childNum){
		return childArray[childNum];
	}
	
	/**
	 * 获得该节点的父节点
	 * @return {@link Node} 父节点
	 */
	public Node getParent(){
		return parent;
	}
	
	/**
	 * 判断该节点是否是叶节点
	 * @return boolean
	 */
	public boolean isLeaf(){
		return this.childArray[0] == null;
	}
	
	/**
	 * 返回该节点的数据项个数
	 * @return int
	 */
	public int getNumItems(){
		return numItems;
	}
	
	/**
	 * 根据index获得相应位置的DataItem
	 * @param index
	 * @return {@link DataItem}
	 */
	public DataItem getItem(int index){
		return dataItems[index];
	}
	
	/**
	 * 判断该节点的数据项是否满
	 * @return boolean
	 */
	public boolean isFull(){
		return numItems == ORDER - 1;
	}
	
	/**
	 * 根据key查找并返回key在该节点的数据项索引位置;<br>
	 * 未找到相应的key,返回-1
	 * @param key 匹配的key
	 * @return int 索引位置
	 */
	public int findItem(long key){
		for(int i=numItems-1;i>=0;i--){
			DataItem di = dataItems[i];
			
			if(di.data == key){
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * 在节点的数据项中插入一个dataItem
	 * @param dataItem
	 * @return int
	 */
	public int insertItem(DataItem dataItem){
		numItems++;
		for(int i=numItems-1;i>=0;i--){
			DataItem di = dataItems[i];
			if(di != null){
				if(di.data > dataItem.data){
					dataItems[i+1] =  dataItems[i];//data值大于参数的，向右移动
				}else{
					dataItems[i+1] = dataItem;//在i+1位置插入dataItem;
					return i+1;
				}
			}
		}
		dataItems[0] = dataItem;//如果进行到这，说明dataItems是空的
		return 0;
	}
	
	/**
	 * 移除最右边的dataItem
	 * @return {@link DataItem}
	 */
	public DataItem removeItem(){
		DataItem rDI = dataItems[numItems - 1];
		dataItems[numItems - 1] = null;
		numItems--;
		return rDI;
	}
	
	/**
	 * 显示节点的数据项内容（e.g. /50/60/70/）
	 */
	public void displayNode(){
		for(int i=0;i<numItems;i++){
			dataItems[i].displayItem();
		}
		System.out.println("/");
	}
	
}
