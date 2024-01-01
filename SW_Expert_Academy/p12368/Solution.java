package p12368;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());


        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] data = br.readLine().split(" ");

            int A = Integer.parseInt(data[0]);
            int B = Integer.parseInt(data[1]);

            stringBuilder.append("#" + (i + 1) + " ");
            stringBuilder.append(((A + B) % 24) + "\n");

        }

        bw.write(stringBuilder.toString());
        bw.flush();

    }
}
