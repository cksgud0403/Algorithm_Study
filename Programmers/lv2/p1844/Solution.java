package p86051;

import java.util.LinkedList;
import java.util.Queue;


class Node {
   private final int x;
   private final int y;
   private final int dis;

    public Node(int x, int y, int  dis) {
        this.x = x;
        this.y = y;
        this.dis = dis;
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    public int getDis() {
        return dis;
    }
}
class Solution {


    public int solution(int[][] maps) {

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0,};


        boolean[][] visited = new boolean[maps.length][maps[0].length];

        Queue<Node> queue = new LinkedList<>();

        visited[0][0] = true;

        queue.add(new Node(0, 0, 1));

        while (!queue.isEmpty()) {

            Node node = queue.poll();


            if (node.getX() == maps.length - 1 && node.getY() == maps[0].length - 1) {
                return node.getDis();
            }

            for (int i = 0; i < 4; i++) {

                int nx = node.getX() + dx[i];
                int ny = node.getY() + dy[i];

                if(nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length ) continue;

                if(!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.add(new Node(nx, ny, node.getDis() + 1));
                }
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
    }
}
