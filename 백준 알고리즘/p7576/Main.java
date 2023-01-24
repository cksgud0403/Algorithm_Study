package p7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


class Node {
	int y;
	int x;
	
	public Node(int y, int x) {
		this.y = y;
		this.x = x;
	}
}

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nums = br.readLine().split(" ");
		
		int M = Integer.parseInt(nums[0]);
		int N = Integer.parseInt(nums[1]);
		
		
		int[][] map = new int[N][M];
		
		int[][] dis = new int[N][M];
		
		Queue<Node> queue = new LinkedList<>();
		
		for(int i = 0; i < N; i++) {
			String[] data  = br.readLine().split(" ");
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(data[j]);
				
				if(map[i][j] == 1) { //1 이면 큐에 넣는다.
					queue.offer(new Node(i, j));
				}
			}
		}
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		
		
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			
			for(int dir = 0; dir < 4; dir++) {
				int ny = node.y + dy[dir];
				int nx = node.x + dx[dir];
				
				
				if(ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
				
				if(map[ny][nx] == 0) { //아직 익지 않은 토마토이면
					map[ny][nx] = 1;
					queue.offer(new Node(ny, nx));
					dis[ny][nx] = dis[node.y][node.x] + 1; //거리를 + 1;
				}
			}
			
		}
		
		
		boolean flag = true;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 0) {
					flag = false;
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		if(flag) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(dis[i][j] > max) {
						max = dis[i][j];
					}
				}
			}
			//그렇지 않을 경우는 dis 이차원 배열에 저장된 거리 중에서 가장 큰 거리를 출력한다.
			System.out.println(max);
			
		}else {		//만약에 BFS를 수행 후, 0이 있다면 모든 토마토가 익어있는 상태가 아니므로 -1 출력

			System.out.println(-1);
		}
	}
}
