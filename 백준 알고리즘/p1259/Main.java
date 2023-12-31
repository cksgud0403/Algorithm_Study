package p1259;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        while(true) {
            String s = br.readLine();

            if (s.equals("0")) {
                break;
            }

            int left = 0;
            int right = s.length() - 1;

            boolean flag = true;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    flag = false;
                    break;
                }

                left++;
                right--;
            }


            if (flag) {
                stringBuilder.append("yes\n");
            }else {
                stringBuilder.append("no\n");
            }

        }


        bw.write(stringBuilder.toString());
        bw.flush();

    }
}
