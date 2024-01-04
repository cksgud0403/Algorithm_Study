package dfs_and_bfs_application.p12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


class Node {
    int x;
    int y;

    Node(int y, int x) {
        this.y = y;
        this.x = x;
    }
}
public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] size = br.readLine().split(" ");

        int M = Integer.parseInt(size[0]);
        int N = Integer.parseInt(size[1]);

        int[][] adjmatrix = new int[N][M];
        int[][] distance = new int[N][M];


        Queue<Node> queue = new LinkedList<>();



        for (int i = 0; i < N; i++) {
            String[] data = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                adjmatrix[i][j] = Integer.parseInt(data[j]);
                if( adjmatrix[i][j] == 1) {
                    queue.offer(new Node(i, j));
                }

            }
        }


        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int dir = 0; dir < 4; dir++) {
                int ny = node.y + dy[dir];
                int nx = node.x + dx[dir];

                if(ny < 0 || ny >= N || nx < 0 || nx >= M) continue;

                if (adjmatrix[ny][nx] == 0) {
                    adjmatrix[ny][nx] = 1;
                    distance[ny][nx] = distance[node.y][node.x] + 1;
                    queue.offer(new Node(ny, nx));
                }
            }
        }

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {

                if( adjmatrix[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(distance[i][j] > max) {
                    max = distance[i][j];
                }
            }
        }

        System.out.println(max);

    }
}
