package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;

/*
 Graph Ŭ����
 		�ڷ� ������ ��Ÿ��  
 * */

public class Graph {
	private int V; // �׷����� ���� ��
	private LinkedList<Integer>[] adj; //���� ����Ʈ 
	
	//�׷��� �ʱ�ȭ
	
	//adj ���� ����Ʈ�� ��Ÿ����, �� �������� ������ �������� ����� ����
	public Graph(int V) {
		this.V = V;
		adj = new LinkedList[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new LinkedList();
		}
		
	}
	// �׷��� ���� �߰�
	// addEdge �׷����� ������ �߰�
	// v�� w�� ������ �� �� ������ ��Ÿ�� 
	
	public void addEdge(int V, int w) {
		adj[V].add(w);
	}
	
	//BFS Ž���� 
	public void BFS(int start) {
		//visited �迭�� �� ������ �湮 ���θ� ����
		boolean[] visited = new boolean[V]; // �湮 ���θ� ǥ���ϱ� ���� �迭 
		// BFS�� ���� ������ ������ ���
		Queue<Integer> queue = new LinkedList<>();
		
		
		visited[start] = true;
		queue.add(start);
		
		// Ž���� ���� ���(start)���� �����ϰ�
		// ���� ��带 �湮�ϰ� ť�� �߰�
		// ť�� ����� �� ���� �ݺ������� ���� �ܰ迡 ������ ��带 �湮
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
