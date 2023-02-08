package p1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



class Node {
	int y;
	int x;
	
	public Node(int y, int x) {
		this.y = y;
		this.x = x;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken()); //가로
			
			int N = Integer.parseInt(st.nextToken()); //세로
			
			int K = Integer.parseInt(st.nextToken()); //배추가 심어져 있는 위치의 개수
			
			int[][] map = new int[N][M];
			
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				
				int x =  Integer.parseInt(st.nextToken());
				int y =  Integer.parseInt(st.nextToken());
				
				map[y][x] = 1;
				
			}
			
			
			boolean[][] visited = new boolean[N][M];
			
			
			Queue<Node> queue = new LinkedList<>();
			
			int[] dy = {-1, 1, 0, 0};
			int[] dx = {0, 0, -1, 1};
			
			
			int count = 0; //필요한 지렁이의 마리 수;
			
			for(int k = 0; k < N; k++) {
				for(int l = 0; l < M; l++) {
					if(map[k][l] == 1 && visited[k][l] == false) {
						
						count++;
						
						visited[k][l] = true;
						
						queue.offer(new Node(k, l));
						
						while(!queue.isEmpty()) {
							Node node = queue.poll();
							
							for(int dir = 0; dir < 4; dir++) {
								int ny = node.y + dy[dir];
								int nx = node.x + dx[dir];
								
								
								if(ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
								
								if(visited[ny][nx] == false && map[ny][nx] == 1) {
									queue.offer(new Node(ny, nx));
									visited[ny][nx] = true;
								}
								
							}
						}
						
					}
				}
			}
			
			System.out.println(count);
		}

	}

}
