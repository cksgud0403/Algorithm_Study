package p43;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

    private static ArrayList<ArrayList<Integer>> result;

    public static int n;

    public static void dfs(int sum, ArrayList<Integer> selectedNums, int start) {
        if (sum == 10) {
            result.add(selectedNums);
            return;

        }

        for (int i = start; i <= n; i++) {

            if(sum + i <= 10) {
                ArrayList<Integer> list =  new ArrayList<>(selectedNums);
                list.add(i);
                dfs(sum + i, list, i + 1);
            }
        }

    }

    public ArrayList<ArrayList<Integer>> solution(int N) {
        result = new ArrayList<>();
        n = N;

       dfs(0, new ArrayList<>(), 1);

       return result;
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        System.out.println(solution.solution(5));
    }
}
