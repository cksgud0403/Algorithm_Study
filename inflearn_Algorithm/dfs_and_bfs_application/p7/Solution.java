package dfs_and_bfs_application.p7;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {


    static int[][] C;


    static int dfs(int n, int r) {

        if(C[n][r] != 0) return C[n][r];

        if(n == r || r == 0) {
            return 1;
        }




        return C[n][r] = dfs(n - 1, r) + dfs(n - 1, r - 1);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        Integer n = Integer.parseInt(stringTokenizer.nextToken());
        Integer r = Integer.parseInt(stringTokenizer.nextToken());


        C = new int[n + 1][n + 1];

        bw.write(dfs(n, r) + "\n");


        bw.flush();

        br.close();
        bw.close();
    }
}
