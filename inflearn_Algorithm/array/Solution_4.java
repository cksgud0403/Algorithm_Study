package array;

import java.io.*;

public class Solution_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 1;

        for (int i = 1; i <= N; i++) {
            bw.write(b + " ");
            int temp = b;
            b = (a+b);
            a = temp;
        }


        bw.flush();
    }
}