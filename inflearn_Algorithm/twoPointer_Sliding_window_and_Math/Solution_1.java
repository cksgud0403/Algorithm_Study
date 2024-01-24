package twoPointer_Sliding_window_and_Math;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int one = 0;
        int two = 0;

        while((one < N && two < M)) {
            if(A[one] < B[two]) {
                bw.write(A[one++] + " ");
            }else if(A[one] > B[two]) {
                bw.write(B[two++] + " ");
            }else {
                bw.write(A[one++] + " ");
                bw.write(B[two++] + " ");
            }
        }

        while(one < N) {
            bw.write(A[one++] + " ");
        }

        while(two < M) {
            bw.write(B[two++] + " ");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}