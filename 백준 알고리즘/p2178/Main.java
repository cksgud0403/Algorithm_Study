package p2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Coordinates {
	int x;
	int y;
	
	Coordinates(int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	int getX() {
		return this.x;
	}
	
	int getY() {
		return this.y;
	}
}

public class Main {
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[n][m];
		
		int[][] dist = new int[n][m]; //각 좌표의 최단 거리를 저장하기 위한 배열 방문하지 않는 좌표는 -1로 초기화한다. 이렇게 하면 visited 배열이 필요 없어짐
		
		for(int i = 0; i<n; i++) { 
			String nums = br.readLine();
			for(int j = 0; j < m; j++) {
				map[i][j] = nums.charAt(j) - '0';
				dist[i][j] = -1;
			}
		}
		
		dist[0][0] = 0;
		
		
		Queue<Coordinates> q = new LinkedList<>();
		q.add(new Coordinates(0, 0));
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0,  0, 1, -1};
		
		while(!q.isEmpty()) {
			Coordinates c = q.poll();
			
			for(int dir = 0; dir < 4; dir++) { //주변 탐색
				int nx = c.getX() + dx[dir];
				int ny = c.getY() + dy[dir];
				
				
				if(nx >= n || nx < 0 || ny >= m || ny < 0) { //좌표의 범위를 넘어가지 않았는지 확인
					continue;
				}
				
				if(map[nx][ny] == 1 && dist[nx][ny] == -1) { //방문한 좌표인지를 확인 + 갈 수 있는지 확인
					q.offer(new Coordinates(nx, ny));
					dist[nx][ny] = dist[c.getX()][c.getY()] + 1; //거리를 +1 해준다.
				}
				
			}
			
		}
	
		 
		
		
		System.out.println(dist[n-1][m-1] + 1);
		

	}

}
