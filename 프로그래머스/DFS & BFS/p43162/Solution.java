package p43162;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	
	
	public static int solution(int n, int[][] computers) {

		
		boolean[] visited = new boolean[n+1]; //방문 표시
		
		ArrayList<LinkedList<Integer>> adjlist = new ArrayList<LinkedList<Integer>>();
		
		for(int i = 0; i <= n; i++) {
			adjlist.add(new LinkedList<Integer>());
		}
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j && computers[i][j] == 1) {
					adjlist.get(i+1).add(j+1);
				}
			}
			
		}
		
		
		int network_count = 0; //네트워크의 개수
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			if(visited[i] == false) { //아직 방문하지 않았다면
				
				network_count++; //네트워크 개수 증가
				visited[i] = true; //방문 표시
				queue.add(i);
				
				while(!queue.isEmpty()) {
					int vertex = queue.poll();
					
					
					for(int j = 0; j < adjlist.get(vertex).size(); j++) {
						
						int adj_vertex = adjlist.get(vertex).get(j);
						
						if(visited[adj_vertex] == false) {
							visited[adj_vertex] = true;
							queue.add(adj_vertex);
						}
					}
				}
			}
		}
		
		return network_count;
		
    }
	
	
	public static void main(String[] args) {
		
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};	
		
		solution(n, computers);
	}
	
}
