package string;

import java.io.*;

public class Solution_12_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());


        String str = br.readLine();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            stringBuilder.append((char) num);
            str = str.substring(7);

            
        }

        bw.append(stringBuilder);

        bw.flush();

        br.close();
        bw.close();

    }
}
