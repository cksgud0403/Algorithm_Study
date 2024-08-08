package p42889;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;


public class Solution {
    //O(M + 2N + N log N)


    public static int[] solution(int N, int[] stages) {
        int[] challenger = new int[N+2]; //O(N+2) = O(N)의 시간 복잡도를 가짐 - 왜냐하면 배열의 원소들을 0으로 초기화하는 과정이 있기 때문에


        for (int i = 0; i < stages.length; i++) {  //O(M)
            challenger[stages[i]]++; //아직 클리어하지 못한 플레이어의 수
        }

        //스테이지별 실패율 계산함
        HashMap<Integer, Double> fails = new HashMap<>();


        int total = stages.length;


        for (int i = 1; i <= N; i++) { //O(N)
            if(challenger[i] == 0) {
                fails.put(i, 0.0);
            }else {
                fails.put(i, (double)challenger[i]/total);

                total -= challenger[i];
            }
        }

        return fails.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray(); //O(NlogN)
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3})));
    }
}
