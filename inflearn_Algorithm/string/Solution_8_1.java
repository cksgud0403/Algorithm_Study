package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_8_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        str = str.toLowerCase().replaceAll("[^a-z]", "");

        String reverseStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reverseStr)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");

        }

        br.close();
    }
}

