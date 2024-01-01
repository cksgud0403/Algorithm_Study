package p10505;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();


        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {

            int N = Integer.parseInt(br.readLine());
            String[] data = br.readLine().split(" ");

            int sum = 0;
            double avg = 0;
            int count = 0;

            for (int j = 0; j < N; j++) {
                sum += Integer.parseInt(data[j]);
            }

            avg = (double) sum / N;

            for (int j = 0; j < N; j++) {
                if (Integer.parseInt(data[j]) <= avg) {
                    count++;
                }
            }


            stringBuilder.append("#" + (i + 1) + " ");
            stringBuilder.append(count + "\n");

        }

        bw.write(stringBuilder.toString());
        bw.flush();
    }
}
