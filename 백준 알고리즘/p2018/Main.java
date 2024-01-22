package p2018;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = (i + 1);
        }

        int sum = 1;
        int start = 0;
        int end = 0;
        int count = 1;

        while (nums[end] != N) {

            if (sum < N) {
                end++;
                sum += nums[end];
            }else if (sum == N) { //sum과 N이 같을 때
                count++; //경우의 수 + 1
                sum -= nums[start]; //start가 가르키는 숫자를 뺀다.
                start++; //start가 가르키는 숫자를 바꾼다.
            }else if(sum > N){
                sum -= nums[start];
                start++;
            }
        }

        System.out.println(count);

        bw.flush();

        br.close();
        bw.close();

    }
}
