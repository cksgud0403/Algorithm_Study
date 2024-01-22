package p1940;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] nums = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }


        Arrays.sort(nums);


        int start = 0;
        int end = N-1;

        int count = 0;

        while (start < end) {
            if(nums[start] + nums[end] < M) {
                start++;
            }else if(nums[start] + nums[end] > M) {
                end--;
            }else if(nums[start] + nums[end] == M) {
                count++;
                start++;
                end--;
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();

        br.close();
        bw.close();

    }
}
