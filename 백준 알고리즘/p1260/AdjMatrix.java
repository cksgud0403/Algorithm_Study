package p1260;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class AdjMatrix {
	static 	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
	public static void dfs(int start, int[][] adjmatrix, boolean[] visited) throws IOException {
		
		visited[start] = true;
		
		bw.write(String.valueOf(start) + " ");
		
		
		for(int i = 1; i<adjmatrix.length; i++) {
				if(adjmatrix[start][i] == 1 && !visited[i]) {
					dfs(i, adjmatrix, visited);
				}
		}
		
	}
	
	public static void bfs(int start, int[][] adjmatrix, boolean[] visited) throws IOException {
		
		Queue<Integer> queue = new LinkedList<Integer>();
	
		visited[start] = true; //방문 표시
		
		queue.offer(start); //첫번째 노드를 삽입
		
		while(!queue.isEmpty()) { 
			
			int v = queue.poll(); //큐에서 하나를 꺼낸다.
			
			bw.write(String.valueOf(v) + " ");
			
			for(int i = 1; i<adjmatrix.length; i++) {
				if(adjmatrix[v][i] == 1 && !visited[i]) {
					
					queue.offer(i);
					visited[i]= true;
				}
			}
			
			
		}
		
		bw.flush();
		bw.close();
		

	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); //정점의 개수
		int m = Integer.parseInt(input[1]); //간선의 개수
		int v = Integer.parseInt(input[2]); //시작 정점
		
		//인접 행렬로 표현
		int[][] adjmatrix = new int[n+1][n+1]; //인접 행렬
		
		//방문처리를 위한 boolean 배열 선언
		boolean [] visited = new boolean[n+1]; //방문 표시
		
		
		//간선연결
		for(int i = 0; i < m; i++) {
			input = br.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int to = Integer.parseInt(input[1]);
			
			adjmatrix[start][to] = 1;
			adjmatrix[to][start] = 1;

		}
		
		
		dfs(v, adjmatrix, visited);
		
		bw.write("\n");
		
		visited = new boolean[n+1];
		
		
		bfs(v, adjmatrix, visited);
		
		br.close();
		bw.close();
		
	}

}
