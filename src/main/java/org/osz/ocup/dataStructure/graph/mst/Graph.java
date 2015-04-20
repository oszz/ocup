package org.osz.ocup.dataStructure.graph.mst;


/**
 * 无向的图<br>
 * mst:最小生成树
 * @author zz
 *
 */
public class Graph {

	private int MAX_SIZE = 20;//大小
	private int nVers;//当前顶点的位置
	private Vertex[] vertexArr;//顶点的数组
	private int[][] adjMat;//邻接矩阵 adjacency matrix(存放顶点直接的连接边：1表示连接，0表示不连接)
	private StackX stackX;
	
	public Graph(){
		vertexArr = new Vertex[MAX_SIZE];
		adjMat = new int[MAX_SIZE][MAX_SIZE];
		stackX = new StackX();
		nVers = 0;
		
		for(int i=0;i<MAX_SIZE;i++){
			for(int j=0;j<MAX_SIZE;j++){
				adjMat[i][j] = 0;
			}
		}
	}
	
	/**
	 * 显示顶点
	 * @param index 顶点的索引位置
	 */
	public void displayVertex(int index){
		System.out.print(vertexArr[index].label);
	}
	
	/**
	 * 添加一个顶点
	 * @param value 顶点的值
	 */
	public void add(char value){
		vertexArr[nVers++] = new Vertex(value);
	}
	
	/**
	 * 添加一条边际
	 * @param start 开始的顶点索引位置
	 * @param end 结束的顶点索引位置
	 */
	public void addEdge(int start, int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	/**
	 * 返回顶点(index)的邻接未访问的其他顶点
	 * @param index 当前顶点的索引位置
	 * @return 邻接未访问的其他顶点索引位置，如果没有返回 -1
	 */
	public int getAdjUnvisitedVertex(int index){
		for(int i=0;i<nVers;i++){
			if(adjMat[index][i] == 1 && vertexArr[i].wasVisited == false){//相连并没被访问过
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 最小生成树
	 */
	public void mst(){
		
		vertexArr[0].wasVisited = true;//第一个顶点的操作：设置访问过、显示、压入栈
		stackX.push(0);
		
		while(!stackX.isEmpty()){
			int currentVertex = stackX.peek();
			int v = getAdjUnvisitedVertex(currentVertex);
			if(v == -1){
				stackX.pop();
			}else{
				vertexArr[v].wasVisited = true;
				stackX.push(v);
				
				displayVertex(currentVertex);
				displayVertex(v);
				System.out.print(" ");
			}
		}
		
		for(int i=0;i<nVers;i++){//重置访问，用于下次搜索
			vertexArr[i].wasVisited = false;
		}
	}
}
