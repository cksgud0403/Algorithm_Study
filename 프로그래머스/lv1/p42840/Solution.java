package p42840;

import java.util.ArrayList;
import java.util.Arrays;




public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5})));
    }

    public static int[] solution(int[] answers) {


        int[][] giveUp = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] count = new int[3];


        //O(N)

        for(int i = 0; i < answers.length; i++) {


            for(int j = 0; j < 3; j++) {
                if(giveUp[j][(i % giveUp[j].length)] == answers[i]) {
                    count[j]++;
                }
            }

        }

        /*

        int maxValue = count[0];


        for(int value : count) {
            if(value > maxValue) {
                maxValue = value;
            }
        }

        */

        //O(N)
        int maxValue = Arrays.stream(count).max().getAsInt();

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < count.length; i++) {
            if(count[i] == maxValue) {
                answer.add((i +1 ));
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}