package p76501;

public class Solution {
    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i]) {
                sum += absolutes[i];
            }else {
                sum += absolutes[i] * -1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 4, 7, 12 }, new boolean[] {true, false, true} ));
    }
}