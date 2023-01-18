package p1303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;



class Node {
	int x, y;
	
	
	Node(int y, int x) {
		this.y = y;
		this.x = x;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] sizes = br.readLine().split(" ");
		
		int N = Integer.parseInt(sizes[0]); //가로
		
		int M = Integer.parseInt(sizes[1]); //세로
		
		char[][] map = new char[M][N]; //맵
		
		boolean[][] visited = new boolean[M][N]; //방문 표시
		
		int[] sum = new int[2];
		
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		
		
		for(int i = 0; i < M; i++) {
			String data = br.readLine();
			for(int j = 0 ; j < N; j++) {
				map[i][j] = data.charAt(j);
			}
		}
		
		
		Queue<Node> queue = new LinkedList<>();
		
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				
				if(visited[i][j] == false) { //아직 방문하지 않았다면 시작 정점을 기준으로 BFS 작업 시작
					
					visited[i][j] = true; //방문 표시
					
					queue.offer(new Node(i, j));
					
					
					int power = 0;
					
					while(!queue.isEmpty()) {
						Node node = queue.poll();
						
						power++;
						
						//현재 노드의 좌표를 기준으로 상 하 좌 우에 방문하지 않는 인접한 노드가 있는지 확인한다. 이것 때문에 인접 행렬 또는 인접 리스트가 필요가 없음
						for(int dir = 0; dir < 4; dir++) {
							int ny = node.y + dy[dir];
							int nx = node.x + dx[dir];
							
							
							//좌표 값이 범위가 넘어가면 안됨
							if(ny < 0 || ny >= M || nx < 0 || nx >= N) continue;
							
							
							//아직 방문하지 않았고, 현재 노드와 같은 값이라면 방문 표시
							if(visited[ny][nx] == false && map[ny][nx] == map[node.y][node.x]) {
								visited[ny][nx] = true;
								queue.offer(new Node(ny, nx));
							}
						}
						
					}
					
					//시작점 노드의 문자를 기준으로 각 위력의 합을 구한다.
					if(map[i][j] == 'W') {
						sum[0] += power * power;
					}else if(map[i][j] == 'B') {
						sum[1] += power * power;
					}
				}
				
			}
		}
		
		
		System.out.print(sum[0] + " " + sum[1]);

	}
	

}
