package p12949;

import java.util.Arrays;

public class Solution {

    //NxM 크기의 행렬 arr1과 MxL 크기의 행렬 arr2 행렬를 곱한다.
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++) { //N번
            for(int j = 0; j < arr2[0].length; j++) {//L번

                int sum = 0;

                for(int k = 0; k < arr1[0].length; k++) { //M번 반복

                    sum += arr1[i][k] * arr2[k][j];
                }

                answer[i][j] = sum;
            }

        }

        return answer;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][] {
                        {1, 4},
                        {3, 2},
                        {4, 1}
                },

                new int[][] {
                        {3, 3},
                        {3, 3}
                })));
    }
}
