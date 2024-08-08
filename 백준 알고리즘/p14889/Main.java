package p14889;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N;

    static boolean[] pick;

    static int[][] abilitys;

    static int min = Integer.MAX_VALUE;

    static void dfs(int L, int start) {
        //N / 2개를 뽑아야 함.

        if(L == N / 2) {


//            for(int i = 0; i < N; i++) {
//                if(pick[i]) {
//                    System.out.print(i + " ");
//                }
//            }
//
//            System.out.println();

            int start_team = 0;

            int link_team = 0;

            for(int i = 0; i < N-1; i++) {
                for(int j = i + 1; j < N; j++) {
                    if(pick[i] && pick[j]) { //N개 중에 두 명을 뽑아서 둘다 true 값이면 같은 팀
                        start_team += abilitys[i][j] + abilitys[j][i];
                    }

                    if(!pick[j] && !pick[i]) {
                        link_team += abilitys[i][j] + abilitys[j][i];
                    }
                }
            }

            min = Math.min(min, Math.abs(start_team - link_team)); //음수가 나오지 않도록 둘의 차이를 구함.

            return;
        }


        for(int i = start; i < N; i++) {
            pick[i] = true;
            dfs(L+1, i+1);
            pick[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        N = Integer.parseInt(br.readLine());

        pick = new boolean[N];


        abilitys = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                abilitys[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        dfs(0, 0);


        bw.write(min + "\n");

        bw.flush();

        br.close();
        bw.close();
    }
}
