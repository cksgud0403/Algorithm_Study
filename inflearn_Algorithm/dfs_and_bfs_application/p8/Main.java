package dfs_and_bfs_application.p8;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] c, p;

    static int[][] combinationBuffer;

    static boolean[] check;

    static int n, f;

    static boolean flag = false;

    static int combination(int n, int r) {

        if(combinationBuffer[n][r] !=0) return combinationBuffer[n][r];

        if(n == r || r == 0) return 1;

        return combinationBuffer[n][r] = combination(n - 1, r-1) + combination(n-1, r);

    }

    static void dfs(int L, int sum) {
        if(flag) return;

        if(L == n) { //r

            for(int i = 0; i < n; i++) {
                System.out.print(p[i] + " ");
            }

            System.out.println();

            if(sum == f) {
                for(int i = 0; i < n; i++) {
                    System.out.print(p[i] + " ");
                }

                System.out.println();

                flag = true;
            }

            return;
        }


        for(int i = 1; i <= n; i++) { //n

            if(check[i]) continue;

            p[L] = i;
            check[i] = true;
            dfs(L + 1, sum + (p[L] * c[L]));
            check[i] = false;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stringTokenizer.nextToken());
        f = Integer.parseInt(stringTokenizer.nextToken());

        c = new int[n];

        p = new int[n];

        check = new boolean[n+1];

        combinationBuffer = new int[n+1][n+1];

        for (int i = 0; i < n; i++) {
            c[i] = combination(n-1, i);
        }


        //dfs(0,0);
        dfs(0, 0);


        bw.flush();

        br.close();
        bw.close();
    }
}
