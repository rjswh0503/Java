package com.kh.Practice;

import com.kh.GraphMain.Graph;

public class DFSGraph {

	public static void main(String[] args) {
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
