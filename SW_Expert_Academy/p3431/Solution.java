package p3431;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();


        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] data = br.readLine().split(" ");
            int L = Integer.parseInt(data[0]);
            int U = Integer.parseInt(data[1]);
            int X = Integer.parseInt(data[2]);

            stringBuilder.append("#" + (i + 1) + " ");

            if(U < X) {
                stringBuilder.append(-1);
            }else if (X >= L && X <= U) {
                stringBuilder.append(0);
            } else if (L > X) {
                stringBuilder.append(L - X);
            }


            stringBuilder.append("\n");

        }

        bw.write(stringBuilder.toString());
        bw.flush();
    }
}
