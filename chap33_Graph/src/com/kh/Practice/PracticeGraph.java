package com.kh.Practice;

import com.kh.GraphMain.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		PracticeGraph ph = new PracticeGraph();
		ph.BFSPracticeMain();
		//ph.DFSPracticeMain();

	}
	
	public void BFSPracticeMain() {
		
		BFSGraph p = new BFSGraph(7);
		
		
		p.addEdge(0, 1);
		p.addEdge(0, 2);
		p.addEdge(1, 3);
		p.addEdge(1, 4);
		p.addEdge(2, 5);
		p.addEdge(2, 6);
		
		System.out.println("BFS Å½»ö °á°ú : ");
		
		p.BFS(0);
			
		
	}
	
	public void DFSPracticeMain() {
		
			int ver = 9;
		
		Graph grp = new Graph(ver);
		
		grp.addEdge(0, 1);
		grp.addEdge(0, 2);
		grp.addEdge(1, 2);
		grp.addEdge(1, 3);
		grp.addEdge(3, 5);
		grp.addEdge(2, 4);
		grp.addEdge(4, 7);
		grp.addEdge(4, 8);
		
	
		
		
		System.out.println("DFS Å½»ö °á°ú : ");
		
		
		grp.DFS(0);
		
		
		
		
	}
	
	
	
	
	

}
