package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int answer = 0;

        for (char c : str.toCharArray()) {

            if(c >= '0' && c <= '9') {
                answer = answer * 10 + (c - '0');
            }

        }

        System.out.println(answer);

        br.close();
    }
}
