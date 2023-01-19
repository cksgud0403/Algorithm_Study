package p2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] map = new char[N][N];
		
		
		for(int i = 0; i < N; i++) {
			String data = br.readLine();
			for(int j = 0; j < N; j++) {
				map[i][j] = data.charAt(j);
			}
		}
		
		int[] dx = {-1, 1, 0, 0 };
		int[] dy = {0, 0, -1, 1};
		
		
		boolean[][] visited = new boolean[N][N];
		
		
		Queue<Node> queue = new LinkedList<Node>();
		
		
		ArrayList<Integer> Arraylist = new ArrayList<Integer>();
		
		
		int homeComplex = 0; //단지의 수
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] == '1' && visited[i][j] == false) {
					
					homeComplex++;
					
					queue.offer(new Node(i, j));
					
					visited[i][j] = true;
					
					int homeCount  = 0; //집의 수
					
					while(!queue.isEmpty()) {
						Node node = queue.poll();
						
						homeCount++;
						
						//4방향을 검사한다.
						for(int dir = 0; dir < 4; dir++) {
							int ny = node.y + dy[dir];
							int nx = node.x + dx[dir];
							
							
							if(ny < 0 || ny >= N || nx < 0 || nx>= N) continue; //좌표가 범위에 넘어갈 경우
							
							
							if(map[ny][nx] == '1' && visited[ny][nx] == false) {
								
								queue.offer(new Node(ny, nx));
								visited[ny][nx] = true;
							}
							
						}
					}
					
					Arraylist.add(homeCount);
				}
			}
		}
		
		
		Collections.sort(Arraylist);
		
		
		
		System.out.println(homeComplex);
		
		for(int i = 0; i < Arraylist.size(); i++) {
			
			System.out.println(Arraylist.get(i));
		}

	}

}
