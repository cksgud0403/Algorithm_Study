package p7568;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        int[] weights = new int[N];
        int[] heights = new int[N];
        int[] ranking = new int[N];

        for (int i = 0; i < N; i++) {
            String[] data = br.readLine().split(" ");
            weights[i] = Integer.parseInt(data[0]);
            heights[i] = Integer.parseInt(data[1]);
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(j == i) {
                    continue;
                }else {
                    if (weights[i] < weights[j] && heights[i] < heights[j]) {
                        ranking[i]++;
                    }
                }
            }
        }


        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < N; i++) {
            stringBuilder.append(ranking[i] + 1);
            if(i != N-1) {
                stringBuilder.append(" ");
            }
        }


        bw.write(stringBuilder.toString());
        bw.flush();

    }
}
