package p159993;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Solution {

    private static class Node {
        int x;
        int y;


        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {1, -1, 0, 0};

    private static char[][] map;
    private static int N, M;

    private static int bfs(Node start, Node end) {

        Queue<Node> queue = new LinkedList<>();

        queue.add(start);

        int[][] dist = new int[N][M];

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.x == end.x && node.y == end.y) {
                return dist[node.x][node.y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                if(dist[nx][ny] == 0 && map[nx][ny] != 'X') {
                    dist[nx][ny] = dist[node.x][node.y] + 1;
                    queue.add(new Node(nx, ny));
                }

            }


        }

        return -1;
    }
    public static int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();

        map = new char[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = maps[i].charAt(j);
            }
        }


        Node start = null, end = null, lever = null;

        //시작 -> 레버까지 최단 거리 + 레버에서 출구까지의 최단거리

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 'S') {
                    start = new Node(i, j);
                }else if(map[i][j] == 'L') {
                    lever = new Node(i, j);
                }else if(map[i][j] == 'E') {
                    end = new Node(i, j);
                }
            }
        }


        int startLever = bfs(start, lever);
        int leverEnd = bfs(lever, end);


        if(startLever == -1 || leverEnd == -1) return -1;

        return startLever + leverEnd;
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        System.out.println(solution.solution(new String[] {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"}));
    }
}
