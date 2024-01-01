package p12004;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());

            boolean flag = false;

            for (int j = 1; j <= 9; j++) {
                for(int k = 1; k <= 9; k++) {
                    if (num == j * k) {
                        flag = true;
                    }
                }
            }

            stringBuilder.append("#" + (i + 1) + " ");

            if (flag) {
                stringBuilder.append("Yes");
            }else {
                stringBuilder.append("No");
            }

            stringBuilder.append("\n");

        }


        bw.write(stringBuilder.toString());
        bw.flush();
    }
}
