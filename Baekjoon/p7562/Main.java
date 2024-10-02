package p7562;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x= x;
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        for(int i = 0; i < T; i++) {
            int l = Integer.parseInt(br.readLine());

            boolean[][] visited = new boolean[l][l];
            int[][] dist = new int[l][l];

            Queue<Node> q = new LinkedList<>();

            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

            int startX = Integer.parseInt(stringTokenizer.nextToken());
            int startY = Integer.parseInt(stringTokenizer.nextToken());


            stringTokenizer = new StringTokenizer(br.readLine(), " ");


            int endX = Integer.parseInt(stringTokenizer.nextToken());
            int endY = Integer.parseInt(stringTokenizer.nextToken());

            q.add(new Node(startX, startY));

            visited[startX][startY] = true;

            while(!q.isEmpty()) {
                Node n = q.poll();

                if (n.x == endX && n.y == endY) {
                    bw.write(dist[n.x][n.y] + "\n");
                    break;
                }


                for (int dir = 0; dir < 8; dir++) {
                    int nx = n.x + dx[dir];
                    int ny = n.y + dy[dir];


                    if(nx < 0 || ny < 0 || nx >= l || ny >= l) continue;

                    if(!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        dist[nx][ny] = dist[n.x][n.y] + 1;
                        q.add(new Node(nx, ny));
                    }
                }

            }
        }


        bw.flush();

        br.close();
        bw.close();

    }
}