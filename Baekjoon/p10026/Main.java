package p10026;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}



public class Main {

    static boolean[][] visited;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static char[][] map;

    static int N;

    static void bfs(int i, int j) {
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(i, j));

        visited[i][j] = true;

        while(!q.isEmpty()) {
            Node node = q.poll();

            for(int k = 0; k < 4; k++) {
                int nx = node.x + dx[k];
                int ny = node.y + dy[k];


                if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue; //범위 체크

                if(!visited[nx][ny] && map[nx][ny] == map[node.x][node.y]) { //같은 문자라면
                    visited[nx][ny] = true; //방문 표시
                    q.add(new Node(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        N = Integer.parseInt(br.readLine());

        map = new char[N][N];


        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }

//        방문 표시 초기화

       visited = new boolean[N][N];



        //적록색인 사람이 아닌 때

        int count1 = getCount1();


        //적록색인 사람일 떄


        //방문 표시 초기화
        visited = new boolean[N][N];


        //R와 G를 구별을 못하므로 G를 -> R로 변환
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if (map[i][j] == 'G') {
                    map[i][j] = 'R';
                }
            }
        }


        int count2 = getCount1();


        bw.write(count1 + " " + count2);


        bw.flush();

        br.close();
        bw.close();

    }

    private static int getCount1() {
        int count = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {

                    count++;

                    bfs(i, j);

                }
            }
        }
        return count;
    }

}