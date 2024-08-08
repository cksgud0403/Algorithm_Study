package p49994;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    private static final HashMap<Character, int[]> location = new HashMap<>();

    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }


    private static boolean isValidMove(int nx, int ny) {
        return 0 <=nx && 0 <= ny && nx < 11 && ny < 11;
    }

    public static int solution(String dirs) {


        initLocation();

        int x = 5;
        int y = 5;

        HashSet<String> answer = new HashSet<>();

        for (int i = 0; i < dirs.length(); i++) {

            int[] offset = location.get(dirs.charAt(i));

            int nx = x + offset[0];
            int ny = y + offset[1];

            if(!isValidMove(nx, ny)) continue;


            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);

            x = nx;
            y = ny;
        }

        return answer.size() / 2;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(solution("ULURRDLLU"));
    }
}
