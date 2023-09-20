package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;

/*
 Graph 클래스
 		자료 구조를 나타냄  
 * */

public class Graph {
	private int V; // 그래프의 정점 수
	private LinkedList<Integer>[] adj; //인접 리스트 
	
	//그래프 초기화
	
	//adj 인접 리스트를 나타내고, 각 정점마다 인접한 정점들의 목록을 저장
	public Graph(int V) {
		this.V = V;
		adj = new LinkedList[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new LinkedList();
		}
		
	}
	// 그래프 간선 추가
	// addEdge 그래프에 간선을 추가
	// v와 w가 간선의 양 끝 정점을 나타냄 
	
	public void addEdge(int V, int w) {
		adj[V].add(w);
	}
	
	//BFS 탐색을 
	public void BFS(int start) {
		//visited 배열은 각 정점의 방문 여부를 추적
		boolean[] visited = new boolean[V]; // 방문 여부를 표시하기 위한 배열 
		// BFS를 위한 데이터 구조로 사용
		Queue<Integer> queue = new LinkedList<>();
		
		
		visited[start] = true;
		queue.add(start);
		
		// 탐색은 시작 노드(start)에서 시작하고
		// 시작 노드를 방문하고 큐에 추가
		// 큐가 비어질 때 까지 반복적으로 다음 단계에 인접한 노드를 방문
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
					
					
					
				}
			}
		}
	}
}
