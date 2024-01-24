package p1253;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        long[] nums = new long[N];

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }


        Arrays.sort(nums);


        int count = 0;

        for (int i = 0; i < N; i++) {

            int start = 0;
            int end = N-1;

            while (start < end) {
                if (nums[start] + nums[end] < nums[i]) {
                    start++;
                }else if (nums[start] + nums[end] > nums[i]) {
                    end--;
                }else if (nums[start] + nums[end] == nums[i]) {
                    if(start != i && end != i) {
                        count++;
                        break;
                    }

                    if(start == i) start++;
                    if(end == i) end--;

                }
            }
        }



        bw.write(String.valueOf(count));

        bw.flush();

        br.close();
        bw.close();

    }
}
