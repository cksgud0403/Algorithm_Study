package dfs_and_bfs_application.p1;

import java.util.Scanner;



public class Solution {

    static int N, total;
    static boolean flag = false;

    static String answer = "NO";

    public static void dfs(int L, int sum, int[] arr) {

        if(flag) return;

        if(sum > total / 2) return;

        if (L == N) {
            if (sum == (double) total / 2) {
                answer = "YES";
                flag = true;
            }
        }else {
            dfs(L + 1, sum + arr[L], arr);
            dfs(L + 1, sum, arr);
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        dfs(0, 0, arr);


        System.out.println(answer);
    }
}
