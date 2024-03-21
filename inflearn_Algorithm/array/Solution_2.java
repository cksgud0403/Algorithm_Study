package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }


        System.out.println(solution(N, arr));
    }

    public static int solution(int N, int[] arr) {

        int count = 0;

        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if(maxHeight < arr[i]) {
                count++;
                maxHeight = arr[i];
            }
        }

        return count;
    }
}