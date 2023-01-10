package p11724;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] visited = null;
	static int Connected_Component_of_num; //연결 요소의 개수
	static int[][] graph;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nums = br.readLine().split(" ");
		
		
		int N = Integer.parseInt(nums[0]);
		int M = Integer.parseInt(nums[1]);
		
		
		visited = new int[N + 1];
		
		
		graph = new int[N + 1][N + 1];
		
		
		for(int i = 0; i < M; i++) {
			
			String[] edge = br.readLine().split(" ");
			
			int from = Integer.parseInt(edge[0]);
			int to = Integer.parseInt(edge[1]);
			
			graph[from][to] = 1;
			graph[to][from] = 1;
		
		}
		
		
		for(int i = 1; i <= N; i++) {
			bfs(i);
		}
		
		bw.write(String.valueOf(Connected_Component_of_num));
		bw.flush();		
	}
	
	
	public static void bfs(int vertex) {
		if(visited[vertex] == 1) { //방문 했으면 그대로 리턴
			return;
			
		}else {
			
			Connected_Component_of_num++; //연결 요소를 증가
			
			Queue<Integer> queue = new LinkedList<>();
			
			queue.add(vertex);
			
			while(!queue.isEmpty()) {
				int cur = queue.poll();
				
				//아직 방문 하지 않았으며, 인접 노드를 큐에 저장
				for(int i = 1; i <= graph.length - 1; i++) {
					if(visited[i] != 1 && graph[cur][i] == 1) {
						queue.add(i);
					}
				}
				
			}
			
			
		}
		
	}

}
