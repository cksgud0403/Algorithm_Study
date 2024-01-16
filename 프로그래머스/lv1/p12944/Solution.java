package p12944;

public class Solution {
    public static double solution(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4}));
    }
}