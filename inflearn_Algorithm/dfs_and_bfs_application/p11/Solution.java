package dfs_and_bfs_application.p11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


class Node {
    int x;
    int y;


    public Node(int y, int x) {
        this.y = y;
        this.x = x;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] adjmatrix = new int[7][7];
        int[][] distances = new int[7][7];

        for (int i = 0; i < 7; i++) {

            String[] data = br.readLine().split(" ");

            for (int j = 0; j < 7; j++) {
                adjmatrix[i][j] = Integer.parseInt(data[j]);
                distances[i][j] = -1;
            }
        }


        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(0, 0));

        distances[0][0] = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int dir = 0; dir < 4; dir++) {
                int ny = node.y + dy[dir];
                int nx = node.x + dx[dir];

                if(ny < 0 || ny >= 7 || nx < 0 || nx >= 7) continue;

                if(distances[ny][nx] == -1 && adjmatrix[ny][nx] == 0) {
                    queue.offer(new Node(ny, nx));
                    distances[ny][nx] = distances[node.y][node.x] + 1;
                }
            }

        }

        System.out.println(distances[6][6]);

    }
}
