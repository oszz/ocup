package org.osz.ocup.dataStructure.graph.bfs;

public class GraphApp {

	public static void main(String[] args) {
		Graph theGraph = new Graph();
		
		theGraph.add('A');
		theGraph.add('B');
		theGraph.add('C');
		theGraph.add('D');
		theGraph.add('E');
		
		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);
	
		
		System.out.print("Visits: ");
		theGraph.bfs();
		System.out.println();
	}
}
