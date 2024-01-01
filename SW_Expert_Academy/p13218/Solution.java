package p13218;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();


        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            stringBuilder.append("#" + (i + 1) + " ");
            stringBuilder.append(N / 3 + "\n");
        }

        bw.write(stringBuilder.toString());
        bw.flush();
    }
}
