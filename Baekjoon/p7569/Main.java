package p7569;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    int h, x, y;

    Node(int h, int x, int y) {
        this.h = h;
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(stringTokenizer.nextToken()); // 열
        int N = Integer.parseInt(stringTokenizer.nextToken()); // 행
        int H = Integer.parseInt(stringTokenizer.nextToken()); // 높이

        int[][][] map = new int[H][N][M];
        int[][][] dist = new int[H][N][M]; // 각 토마토가 익는데 걸린 일수 저장

        int[] dx = {0, 0, -1, 1, 0, 0};
        int[] dy = {1, -1, 0, 0, 0, 0};
        int[] dh = {0, 0, 0, 0, 1, -1};

        Queue<Node> q = new LinkedList<>();

        // 토마토 농장 정보 입력 및 익은 토마토를 큐에 추가
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                stringTokenizer = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < M; k++) {
                    map[i][j][k] = Integer.parseInt(stringTokenizer.nextToken());
                    if (map[i][j][k] == 1) {
                        q.add(new Node(i, j, k)); // 익은 토마토 큐에 추가
                    }
                }
            }
        }

        // BFS 시작
        while (!q.isEmpty()) {
            Node n = q.poll();

            for (int dir = 0; dir < 6; dir++) {
                int nh = n.h + dh[dir];
                int nx = n.x + dx[dir];
                int ny = n.y + dy[dir];

                // 범위 체크
                if (nh < 0 || nx < 0 || ny < 0 || nh >= H || nx >= N || ny >= M) continue;

                // 익지 않은 토마토가 있을 때만 처리
                if (map[nh][nx][ny] == 0) {
                    dist[nh][nx][ny] = dist[n.h][n.x][n.y] + 1; // 이전 토마토로부터 1일 추가
                    map[nh][nx][ny] = 1; // 익은 상태로 변경
                    q.add(new Node(nh, nx, ny));
                }
            }
        }

        int answer = 0;
        boolean isPossible = true;

        // 모든 토마토가 익었는지, 걸린 시간 계산
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[i][j][k] == 0) { // 익지 않은 토마토가 있으면 -1 출력
                        isPossible = false;
                    }
                    answer = Math.max(answer, dist[i][j][k]);
                }
            }
        }

        if (!isPossible) {
            bw.write("-1\n");
        } else {
            bw.write(answer + "\n"); // 걸린 일수 출력
        }

        bw.flush();
        br.close();
        bw.close();
    }
}