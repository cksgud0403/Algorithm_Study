package array;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }


        stringTokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if(A[i] == 1) {
                if(B[i] == 1) {
                    stringBuilder.append("D\n");
                }else if(B[i] == 2) {
                    stringBuilder.append("B\n");
                }else if(B[i] == 3) {
                    stringBuilder.append("A\n");
                }
            }else if(A[i] == 2) {
                if(B[i] == 1) {
                    stringBuilder.append("A\n");
                }else if(B[i] == 2) {
                    stringBuilder.append("D\n");
                }else if(B[i] == 3) {
                    stringBuilder.append("B\n");
                }
            }else if(A[i] == 3) {
                if(B[i] == 1) {
                    stringBuilder.append("B\n");
                }else if(B[i] == 2) {
                    stringBuilder.append("A\n");
                }else if(B[i] == 3) {
                    stringBuilder.append("D\n");
                }
            }
        }


        bw.write(stringBuilder.toString());

        bw.flush();

    }
}
