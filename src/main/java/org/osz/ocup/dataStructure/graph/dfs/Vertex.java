package org.osz.ocup.dataStructure.graph.dfs;

/**
 * 图的顶点
 * @author zz
 *
 */
public class Vertex {

	public char label;//标签 e.g. 'A'
	public boolean wasVisited;//是否访问
	
	public Vertex(char label){
		this.label = label;
		wasVisited = false;
	}
	
}
