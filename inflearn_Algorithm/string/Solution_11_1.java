package string;

import java.io.*;

public class Solution_11_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String str = br.readLine();

        str += " ";

        char ch = str.charAt(0);

        int count = 0;

        StringBuilder stringBuilder = new StringBuilder();


        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }else {

                stringBuilder.append(ch);

                if(count >= 2) {
                    stringBuilder.append(count);
                }

                count = 1;
                ch = str.charAt(i);
            }
        }


        bw.append(stringBuilder);

        bw.flush();
        br.close();
    }
}
