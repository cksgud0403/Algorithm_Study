package p1920;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();


        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];

        String[] data = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(data[i]);
        }


        int M = Integer.parseInt(br.readLine());
        String[] data2 = br.readLine().split(" ");


/*
        for (int i = 0; i < M; i++) {

            int num = Integer.parseInt(data2[i]);

            boolean isExist = false;

            for (int j = 0; j < N; j++) {
                if (num == A[j]) {
                    isExist = true;
                    break;
                }

            }

            if (isExist) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
*/

        //선형 탐색 알고리즘은 시간 복잡도가 O(n^2) 이므로 시간 초과가 난다. 따라서 더 나은 탐색 알고리즘으로 풀어야 한다.
        // 아래는 이진 탐색을 활용


        Arrays.sort(A);

        for (int i = 0; i < M; i++) {

            int num = Integer.parseInt(data2[i]);

            int left = 0;

            int right = N-1;

            boolean isExist = false;

            while (left <= right) {
                int mid = (left + right) / 2;

                if(A[mid] == num) {
                    isExist = true;
                    break;
                } else if (A[mid] < num) {
                    left = mid + 1;
                } else if (A[mid] > num) {
                    right = mid - 1;
                }
            }

            if (isExist) {
                stringBuilder.append(1 + "\n");
            } else {
                stringBuilder.append(0 + "\n");
            }

        }


        bw.write(stringBuilder.toString());
        bw.flush();

    }
}
