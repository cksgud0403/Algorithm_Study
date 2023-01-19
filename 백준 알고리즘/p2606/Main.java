package p2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		int E = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Integer>> adjlist = new ArrayList<ArrayList<Integer>>();
		
		
		for(int i = 0; i <= N; i++) { //N + 1개의 ArrayList를 생성
			adjlist.add(new ArrayList<Integer>());
		}
		
		
		for(int i = 0; i < E; i++) {
			String[] inputs = br.readLine().split(" ");
			adjlist.get(Integer.parseInt(inputs[0])).add(Integer.parseInt(inputs[1]));
			adjlist.get(Integer.parseInt(inputs[1])).add(Integer.parseInt(inputs[0]));
		}
		
		
		boolean[] visited = new boolean[N + 1];
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		visited[1] = true;
		
		int count = 0; //바이러스에 걸리는 컴퓨터의 수
		
		while(!queue.isEmpty()) {
			int computer = queue.poll();
			
			count++;
			
			for(int i = 0; i < adjlist.get(computer).size(); i++) {
				int adj_computer = adjlist.get(computer).get(i);
				
				//아직 방문하지 않았다면
				if(visited[adj_computer] == false) {
					queue.offer(adj_computer);
					visited[adj_computer] = true;
				}
			}
		}
		
		System.out.println(count-1);
	}

}
