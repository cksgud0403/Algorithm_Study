package p5427;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Node {
    int x;
    int y;

    Node(int x, int y) {
        this. x = x;
        this. y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

            int col = Integer.parseInt(stringTokenizer.nextToken());
            int row = Integer.parseInt(stringTokenizer.nextToken());


            char[][] map = new char[row][col];

            int[][] dist1 = new int[row][col];
            int[][] dist2 = new int[row][col];

            int[] dx = {0, 0, -1, 1};
            int[] dy = {1, -1, 0, 0};


            Queue<Node> q1 = new LinkedList<>();
            Queue<Node> q2 = new LinkedList<>();


            for (int j = 0; j < row; j++) {

                Arrays.fill(dist1[j], -1);
                Arrays.fill(dist2[j], -1);

                String s = br.readLine();
                for (int k = 0; k < col; k++) {
                    map[j][k] = s.charAt(k);
                    if(map[j][k] == '*') {
                        q1.add(new Node(j, k));
                        dist1[j][k] = 0;
                    }else if(map[j][k] == '@') {
                        q2.add(new Node(j, k));
                        dist2[j][k] = 0;
                    }
                }
            }

            //불을 기준으로 탐색
            while(!q1.isEmpty()) {
                Node n = q1.poll();

                for (int dir = 0; dir < 4; dir++) {
                    int nx = n.x + dx[dir];
                    int ny = n.y + dy[dir];

                    if(nx < 0 || ny < 0 || nx >= row || ny >= col) continue;

                    if(dist1[nx][ny] == -1 && map[nx][ny] != '#') {
                        q1.add(new Node(nx, ny));
                        dist1[nx][ny] = dist1[n.x][n.y] + 1;
                    }
                }

            }


            boolean flag = false;

            //상근이 기준으로 탐색

            while (!q2.isEmpty() && !flag) {  // 탈출하면 더 이상 탐색하지 않도록 수정
                Node n = q2.poll();

                for (int dir = 0; dir < 4; dir++) {
                    int nx = n.x + dx[dir];
                    int ny = n.y + dy[dir];

                    if(nx < 0 || ny < 0 || nx >= row || ny >= col) {
                        flag = true;
                        bw.write(dist2[n.x][n.y] + 1 + "\n");
                        break;
                    }

                    if(dist1[nx][ny] != -1 && dist1[nx][ny] <= dist2[n.x][n.y] + 1) continue;

                    if(dist2[nx][ny] == -1 && map[nx][ny] != '#') {
                        q2.add(new Node(nx, ny));
                        dist2[nx][ny] = dist2[n.x][n.y] + 1;
                    }

                }
            }

            if(!flag) {
                bw.write("IMPOSSIBLE\n");
            }
        }


        bw.flush();

        br.close();
        bw.close();

    }
}