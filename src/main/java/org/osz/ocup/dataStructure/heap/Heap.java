package org.osz.ocup.dataStructure.heap;

/**
 * 堆<br>
 * 基于数组实现的堆,常用于优先级<br>
 * 
 * 一.堆的特点:<br>
 * 1.堆是完全二叉树。也就是说，除了树的最后一层节点不需要是满的，其他的每一层从左到右都完全是满的。<br>
 * 2.堆常常用一个数组实现。<br>
 * 3.每一个节点的关键字都大于(或等于)这个节点的子节点的关键字。<br>
 * 
 * 二.要点:索引的计算。若数组中节点的索引为x,则：<br>
 * 1.它的父节点的下标为：(x-1)/2。<br>
 * 2.它的左子节点的下标为：2x+1。<br>
 * 1.它的右子节点的下标为：2x+2。<br>
 * @author zz
 *
 */
public class Heap {

	private Node[] arr;
	private int maxSize;
	private int currentSize;
	
	public Heap(int maxSize){
		this.maxSize = maxSize;
		this.currentSize = 0;
		this.arr = new Node[this.maxSize];
	}
	
	/**
	 * 判断堆是否为空
	 * @return 如果堆内没有数据，返回<tt>true<tt>,否则返回<tt>false<tt>
	 */
	public boolean isEmpty(){
		return this.currentSize == 0;
	}
	
	/**
	 * 往堆中插入一个数据
	 * @param value 插入的值
	 * @return 插入成功返回<tt>true<tt>,否则返回<tt>false<tt>
	 */
	public boolean insert(int value){
		if(currentSize == maxSize){//如果堆已满，直接返回false
			return false;
		}
		Node newNode = new Node(value);
		arr[currentSize] = newNode;
		tickleUp(currentSize++);
		
		return true;
	}
	
	/**
	 * 向上筛选
	 * @param index 筛选的开始位置索引
	 */
	public void tickleUp(int index){
		int parentIndex = (index - 1)/2;//得到父节点的索引
		Node bottom = arr[index];//保存插入的节点
		while(index > 0 && arr[parentIndex].getKey() < bottom.getKey()){
			arr[index] = arr[parentIndex];
			index = parentIndex;
			parentIndex = (index - 1)/2;
		}
		arr[index] = bottom;
	}
	
	/**
	 * 删除一个节点<br>
	 * 注：始终删除最大的值
	 * @return
	 */
	public Node remove(){
		Node root = arr[0];
		arr[0] = arr[--currentSize];//把最末端的节点放到根节点
		tickleDown(0);
		return root;
	}
	
	/**
	 * 向下筛选
	 * @param index 筛选的开始位置索引
	 */
	public void tickleDown(int index){
		Node top = arr[index];
		int largerChildIndex = 0;
		
		while(index < currentSize/2 ){ //表示节点至少有一个子节点
			int leftChildIndex = 2*index + 1;
			int rightChildIndex = 2*index + 2;
			
			if(rightChildIndex < currentSize //右子节点存在
					&& arr[leftChildIndex].getKey() < arr[rightChildIndex].getKey()){
				largerChildIndex = rightChildIndex;
			}else{
				largerChildIndex = leftChildIndex;
			}
			
			if(top.getKey() >= arr[largerChildIndex].getKey()){
				break;
			}
			arr[index] = arr[largerChildIndex];
			index = largerChildIndex;
		}
		
		arr[index] = top;
	}
	
	/**
	 * 根据索引改变节点的值
	 * @param index 索引位置
	 * @param value 新的值
	 * @return 成功改变返回<tt>true<tt>,否则返回<tt>false<tt>
	 */
	public boolean change(int index, int value){
		if(index < 0 || index >= currentSize){
			return false;
		}
		int oldValue = arr[index].getKey();
		arr[index].setKey(value);
		
		if(oldValue >= value){
			tickleDown(index);//向下筛选
		}else{
			tickleUp(index);//向上筛选
		}
		return true;
	}
	
	/**
	 * 显示堆的内容
	 */
	public void displayHeap(){
		System.out.print("HeapArray:" );
		for(int i=0;i<currentSize;i++){
			if(arr[i] != null){
				System.out.print(arr[i].getKey() + " ");
			}else{
				System.out.print("-- ");
			}
		}
		System.out.println();
		
		int nBlanks = 32;
		int itemsPerRow = 1;
		int column = 0;
		int j = 0;
		String dots = "......................................";
		System.out.println(dots+dots);
		
		while(currentSize > 0){
			if(column == 0){
				for(int i=0;i<nBlanks;i++){
					System.out.print(" ");
				}
			}
			System.out.print(arr[j].getKey());
			if( ++j == currentSize)
				break;
			if(++column == itemsPerRow){
				nBlanks /= 2;
				itemsPerRow *= 2;
				column = 0;
				System.out.println();
			}else{
				for(int i=0;i<nBlanks*2-2;i++){
					System.out.print(" ");
				}
				
			}
		}
		System.out.println("\n" + dots+dots);
	}
	
}
