package p1759;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int L;
    static int C;

    static char[] alphabet;

    static char[] choice;




    public static void dfs(int c, int level) {
        if(level == L) { //뽑는 개수

            int mo = 0;
            int ja = 0;

            for(char x : choice) {
                if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                    mo++;
                }else {
                    ja++;
                }
            }

            if(mo>=1 && ja>=2) {
                System.out.println(choice);
            }

            return;
        }

        for(int i = c; i < alphabet.length; i++) {

                choice[level] = alphabet[i];

                dfs(i+1, level + 1); //c+1을 하는 이유는 중복되는 알바벳 문자를 선택하지 않는 순열을 구현하기 위한 거임.
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        L = Integer.parseInt(stringTokenizer.nextToken());
        C = Integer.parseInt(stringTokenizer.nextToken());


        stringTokenizer = new StringTokenizer(br.readLine());

        alphabet = new char[C];

        choice = new char[L];

        for (int i = 0; i < C; i++) {
           alphabet[i] = stringTokenizer.nextToken().charAt(0);
        }

        Arrays.sort(alphabet);

        dfs(0, 0);


        bw.flush();

        br.close();
        bw.close();
    }
}
