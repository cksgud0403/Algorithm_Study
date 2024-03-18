package p68644;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{2,1,3,4,1})));

    }


    public static int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i != j && !(list.contains(numbers[i] + numbers[j]))) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }


        list.sort((a, b) -> a-b);

        return list.stream(). mapToInt(Integer::intValue).toArray();


    }


/*

    public static int[] solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }


        return hashSet.stream().sorted().mapToInt(Integer::intValue).toArray();

    }
*/

}