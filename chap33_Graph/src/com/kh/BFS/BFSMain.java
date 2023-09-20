package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;

/*
 * BFS Main
 * 
 * 		그래프의 BFS탐색을 구현하고, 주어진 시작 노드로부터 모든 연결된 노드를 
 * 		너비 우선으로 탐색 
 * 
 * 
 * */


public class BFSMain {
	public static void main(String[] args) {
		//Graph 생성
		Graph g = new Graph(9);
		//간선 추가
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		g.addEdge(3, 6);
		g.addEdge(4, 7);
		g.addEdge(4, 8);
		
		
		System.out.println("BFS 탐색 결과 : ");
		//BFS 시작 노드 0 에서 호출해서 실행
		g.BFS(0);
		
		//결과는 BFS의 탐색 결과인 노드 순서 출력
		

	}

}
