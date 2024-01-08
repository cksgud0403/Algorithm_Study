package dfs_and_bfs_application.p2;

import java.io.*;

public class Solution {

    static int C;
    static int N;

    static int max = Integer.MIN_VALUE;

    public static void dfs(int L, int sum, int[] nums) {

        if(sum > C) return;

        if(L == N) {

            if(max < sum) {
                max = sum;
            }

            return;
        }

        dfs(L+1, sum + nums[L], nums);
        dfs(L+1, sum, nums);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] data = br.readLine().split(" ");

        C = Integer.parseInt(data[0]);
        N = Integer.parseInt(data[1]);

       int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        dfs(0, 0, nums);

        bw.write(max + "");
        bw.flush();
    }
}
