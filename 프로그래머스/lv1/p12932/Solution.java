package p12932;

import java.util.ArrayList;

public class Solution {
    public static int[] solution(long n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(n != 0) {
            arrayList.add((int) (n % 10));
            n /= 10;
        }

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(12345);
    }
}