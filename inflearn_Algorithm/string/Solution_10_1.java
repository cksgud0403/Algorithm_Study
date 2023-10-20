package string;

import java.io.*;
import java.util.Arrays;

public class Solution_10_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        String str = s[0];

        char target = s[1].charAt(0);

        int dis = 100;

        int[] answer = new int[str.length()];



        //왼쪽 target으로부터의 거리 계산
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                dis = 0;
            }else {
                dis++;
            }

            answer[i] = dis;

        }


        dis = 100;

        //오른쪽 target으로부터의 거리 계산

        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == target) {
                dis = 0;
            }else {

                dis++;

                if(dis < answer[i]) {
                    answer[i] = dis;
                }
            }
        }


        StringBuilder stringBuilder = new StringBuilder();


        for (int i : answer) {
            stringBuilder.append(i).append(" ");
        }


        bw.append(stringBuilder);

        bw.flush();

        br.close();

    }
}
