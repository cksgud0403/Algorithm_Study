package p11724;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
	static int[] visited = null;
	static int Connected_Component_of_num; //연결 요소의 개수
	static ArrayList<LinkedList<Integer>> graph;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nums = br.readLine().split(" ");
		
		
		int N = Integer.parseInt(nums[0]);
		int M = Integer.parseInt(nums[1]);
		
		
		visited = new int[N + 1];
		
		
		graph = new  ArrayList<LinkedList<Integer>>();
		
		
		for(int i = 0; i <= N; i++) {
			graph.add(new LinkedList<Integer>());
		}
		
		
		for(int i = 0; i < M; i++) {
			
			String[] edge = br.readLine().split(" ");
			
			int from = Integer.parseInt(edge[0]);
			int to = Integer.parseInt(edge[1]);
			
			graph.get(from).add(to);
			graph.get(to).add(from);
		
		}
		
		
		for(int i = 1; i <= N; i++) {
			
			if(visited[i] != 1) { //현재 노드가 방문하지 않았다면 BFS 실행
				bfs(i);
			}
		}
		
		bw.write(String.valueOf(Connected_Component_of_num));
		bw.flush();		
	}
	
	
	public static void bfs(int vertex) {
			
			Connected_Component_of_num++; //연결 요소를 증가
			
			Queue<Integer> queue = new LinkedList<>();
			
			
			visited[vertex] = 1; //현재 노드를 방문 표시
			queue.add(vertex);
			
			while(!queue.isEmpty()) {
				int cur = queue.poll();
				
				Iterator<Integer> iter = graph.get(cur).iterator();
				
				while(iter.hasNext()){ //다음값이 있는지 체크
					int Adjacent_vertext = iter.next();
					if(visited[Adjacent_vertext] != 1) {
						queue.add(Adjacent_vertext);
						visited[Adjacent_vertext] = 1; //현재 노드를 방문 표시
					}
				}
			}
		
	}

}
