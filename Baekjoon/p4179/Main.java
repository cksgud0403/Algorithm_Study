package p4179;

import java.io.*;
import java.util.*;

class Node {
    int x, y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] map = new char[R][C];
        int[][] fireTime = new int[R][C];
        int[][] jihunTime = new int[R][C];

        // 여러 불과 지훈의 시작점을 저장할 큐
        Queue<Node> fireQueue = new LinkedList<>();
        Queue<Node> jihunQueue = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            Arrays.fill(fireTime[i], -1); // 불의 전파 시간을 -1로 초기화
            Arrays.fill(jihunTime[i], -1); // 지훈의 이동 시간을 -1로 초기화

            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);

                if (map[i][j] == 'F') {
                    fireQueue.add(new Node(i, j));
                    fireTime[i][j] = 0;
                }

                if (map[i][j] == 'J') {
                    jihunQueue.add(new Node(i, j));
                    jihunTime[i][j] = 0;
                }
            }
        }

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        // 불에 대한 BFS
        while (!fireQueue.isEmpty()) {
            Node cur = fireQueue.poll();

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue; // 범위 체크
                if (fireTime[nx][ny] >= 0 || map[nx][ny] == '#') continue; // 이미 방문했거나 벽인 경우 패스

                fireTime[nx][ny] = fireTime[cur.x][cur.y] + 1;
                fireQueue.add(new Node(nx, ny)); // 다음 위치를 큐에 넣음
            }
        }

        // 지훈에 대한 BFS
        while (!jihunQueue.isEmpty()) {
            Node cur = jihunQueue.poll();

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur.x + dx[dir];
                int ny = cur.y + dy[dir];

                // 지훈이 탈출 성공한 경우
                if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                    bw.write((jihunTime[cur.x][cur.y] + 1) + "\n");
                    bw.flush();
                    return;
                }

                if (jihunTime[nx][ny] >= 0 || map[nx][ny] == '#') continue; // 이미 방문했거나 벽인 경우 패스

                // 불이 이미 번진 곳이고 지훈이 도착할 시간이 불보다 같거나 크면 패스
                if (fireTime[nx][ny] != -1 && fireTime[nx][ny] <= jihunTime[cur.x][cur.y] + 1) continue;

                jihunTime[nx][ny] = jihunTime[cur.x][cur.y] + 1;
                jihunQueue.add(new Node(nx, ny)); // 다음 위치를 큐에 넣음
            }
        }

        // 탈출에 실패한 경우
        bw.write("IMPOSSIBLE\n");
        bw.flush();

        br.close();
        bw.close();
    }
}