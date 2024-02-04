package p17298;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(br.readLine(), " ");

        Stack<Integer> stack = new Stack<Integer>();

        int[] nums = new int[N];
        int[] result = new int[N];

        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        stack.push(0);

        for(int i = 1; i < N; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];
            }

            stack.push(i);
        }

        while(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for(int i = 0; i < N; i++) {
            bw.write(result[i] + " ");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}