package p11047;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());


        int[] coin = new int[N];


        for(int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }


        int minCount = 0;

        for(int i = N-1; i >= 0; i--) {
            if(K / coin[i] != 0) {
                minCount += K / coin[i];
                K %= coin[i];
            }
        }


        bw.write(String.valueOf(minCount));

        bw.flush();

        br.close();
        bw.close();
    }
}