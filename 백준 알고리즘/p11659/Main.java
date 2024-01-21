package p11659;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[] S = new int[N+1];


        //합 배열 만들기


        stringTokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= N; i++) { //시간 복잡도 O(N)
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        //구간 합 구하기

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine(), " ");

            int I = Integer.parseInt(stringTokenizer.nextToken());
            int J = Integer.parseInt(stringTokenizer.nextToken());

            bw.write(S[J] - S[I-1] + "\n");
        }

        bw.flush();

        br.close();
        bw.close();

    }
}
