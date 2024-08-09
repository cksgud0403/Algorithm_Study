package p2468;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static boolean[][] visited;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int N;

    static int[][] map;

    static void dfs(int x, int y, int hight) {
        visited[x][y] = true; //현재 위치 방문 표시

        for (int k = 0; k < 4; k++) { //인접한 지역을 탐색
            int nx = x + dx[k];
            int ny = y + dy[k];

            if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue; //맵 범위에 벗어나는 구역은 제외

            if(!visited[nx][ny] && map[nx][ny] > hight) dfs(nx, ny, hight); //만약에 새로운 탐색 지역이 아직 방문하지 않았고, 물의 높이보다 크다면 탐색 시작

        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //지역의 높이는 1부터 100이하의 정수

        //모두 잠기지 않는 경우
        //ex) 0이하의 높이는 모두 잠김 (안전한 영역 1개)


        //모두 잠기는 경우
        // ex) 100이하의 높이는 모두 잠김 (안전한 영역 0개)

        int maxCount = 1;

        for(int i = 0; i <= 100; i++) { // O(101 * N^2)

            int count = 0;

            visited = new boolean[N][N];

            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    if(!visited[j][k] && map[j][k] > i) { //아직 방문하지 않았고 현재 값이 물의 높이보다 크다면 탐색 시작
                        //dfs로 안전한 영역의 개수를 구한다.
                        dfs(j, k, i); //높이가 i일 때 j, k를 탐색 시작
                        count++;
                    }
                }
            }

            maxCount = Math.max(maxCount, count);

        }


        bw.write(maxCount + "\n");


        bw.flush();

        br.close();
        bw.close();
    }
}
