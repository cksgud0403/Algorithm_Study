package p11725;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.imageio.spi.ImageInputStreamSpi;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		
		ArrayList<ArrayList<Integer>> adjlist = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i <= N; i++) {
			adjlist.add(new ArrayList<Integer>());
		}
		
		
		for(int i = 0; i < N-1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			adjlist.get(a).add(b);
			adjlist.get(b).add(a);
		}
		
		int[] parent = new int[N + 1];
		boolean[] visited = new boolean[N + 1];
		
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		
		visited[1] = true;
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			
			
			for(int i = 0; i < adjlist.get(node).size(); i++) {
				int adjNode = adjlist.get(node).get(i);
				
				if(visited[adjNode] == false) {
					queue.offer(adjNode);
					visited[adjNode] = true;
					
						parent[adjNode] = node;
				}
				
			}
		}
		
		
		for(int i = 2; i < parent.length; i++) {
			bw.write(parent[i] + "\n");
		}
		
		
		bw.flush();
		
	}

}
