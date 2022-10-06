package p1260;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AdjList {
	static 	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
	public static void dfs(int start, LinkedList<LinkedList<Integer>> adjList, boolean[] visited) throws IOException {
		
		visited[start] = true;
		
		bw.write(String.valueOf(start) + " ");
		
		
		Iterator<Integer> iter = adjList.get(start).iterator();
		
		
		while(iter.hasNext()) {
			int w = iter.next();
			if(!visited[w]) {
				dfs(w, adjList, visited);
			}
		}
		
		
	}
	
	public static void bfs(int start, LinkedList<LinkedList<Integer>> adjList, boolean[] visited) throws IOException {
		
		Queue<Integer> queue = new LinkedList<Integer>();
	
		visited[start] = true; //방문 표시
		
		queue.offer(start); //첫번째 노드를 삽입
		
		while(!queue.isEmpty()) { 
			
			int v = queue.poll(); //큐에서 하나를 꺼낸다.
			
			bw.write(String.valueOf(v) + " ");
			
			
			Iterator<Integer> iter = adjList.get(v).iterator();
			
			while(iter.hasNext()) {
				int w = iter.next();
			if(!visited[w]) {
					visited[w] = true;
					queue.offer(w);
				}
				
			}

		}
		
		
		bw.flush();
		
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); //정점의 개수
		int m = Integer.parseInt(input[1]); //간선의 개수
		int v = Integer.parseInt(input[2]); //시작 정점
		
		//인접 리스트로 표현
		LinkedList<LinkedList<Integer>> adjList= new LinkedList<LinkedList<Integer>>(); 
		
		for(int i = 0; i<=n; i++) {
			adjList.add(new LinkedList<Integer>());
		}
		
		
		//방문처리를 위한 boolean 배열 선언
		boolean [] visited = new boolean[n+1]; //방문 표시
		
		
		//간선연결
		for(int i = 0; i < m; i++) {
			input = br.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int to = Integer.parseInt(input[1]);
			
			adjList.get(start).add(to);
			adjList.get(to).add(start);

		}
		
		
		for(int i = 1; i<=n; i++) { //오름차순 정렬
			Collections.sort(adjList.get(i));
		}
		
		
		dfs(v, adjList, visited);
		
		bw.write("\n");
		
		visited = new boolean[n+1];
		
		
		bfs(v, adjList, visited);
		
		br.close();
		bw.close();
		
	}

}
