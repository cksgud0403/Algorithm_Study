package p1018;

import java.io.*;

public class Main {

    public

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] data = br.readLine().split(" ");
        int height = Integer.parseInt(data[0]);
        int width = Integer.parseInt(data[1]);


        char[][] board = new char[height][width];

        for (int i = 0; i < height; i++) {
            String s = br.readLine();
            for (int j = 0; j < width; j++) {
                board[i][j] = s.charAt(j);
            }
        }


        int result = 64; //최악의 경우

        for (int i = 0; i < height - 7; i++) { //체스판 시작 지점 탐색
            for (int j = 0; j < width - 7; j++) {

                int white = 0; //맨 왼쪽 칸이 흰색일 때 경우의 수
                int black = 0; //맨 윈쪽 칸이 검은색일 때 경우의 수

                for (int k = i;  k < (i + 8); k++) { //8x8 체스판 탐색
                    for (int l = j;  l < (j + 8); l++) {
                        if ((k + l) % 2 == 0) { //짝수 칸
                            if(board[k][l] != 'W') { //짝수 칸이 W가 아닌 경우
                                white++;
                            }

                            if(board[k][l] != 'B') { //짝수 칸이 B가 아닌 경우
                                black++;
                            }
                        }else {
                            if(board[k][l] != 'B') {  //짝수 칸이 W인 경우에 홀수 칸은 B가 아닌 경우를 카운트
                                white++;
                            }

                            if(board[k][l] != 'W') { ////짝수 칸이 B인 경우에 홀수 칸은 W가 아닌 경우를 카운트
                            }
                        }
                    }
                }

                result = Math.min(result, Math.min(white, black));
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();

    }



}
