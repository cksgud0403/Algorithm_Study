package p6730;

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

            int[] nums = new int[N];

            for (int j = 0; j < N; j++) {
                nums[j] = Integer.parseInt(data[j]);
            }

            int up = 0;
            int down = 0;

            for (int j = 0; j < N-1; j++) {
                if(nums[j] < nums[j+1]) { //올라 갔을 때
                    if (nums[j + 1] - nums[j] > up) {
                        up = nums[j + 1] - nums[j];
                    }
                }else  if(nums[j] > nums[j + 1]) { //내려 갔을 때
                    if (nums[j] - nums[j + 1] > down) {
                        down = nums[j] - nums[j + 1];
                    }
                }

            }


            stringBuilder.append("#" + (i + 1) + " " + up + " " + down + "\n");

        }

        bw.write(stringBuilder.toString());
        bw.flush();
    }
}
