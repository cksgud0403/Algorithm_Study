package round3.p2;

public class Main {

    public int solution(String[] bishops) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;


        int[][] map = new int[8][8];


        //좌표를 숫자로 바꾸기

        for (int i = 0; i < bishops.length; i++) {

            int c = bishops[i].charAt(0) - 'A';
            int r = bishops[i].charAt(1) - '0' - 1;


            int[] dc = {1, 1, -1, -1 };
            int[] dr = {1, -1, -1, 1};


            map[r][c] = 1;


            for (int j = 0; j < dc.length; j++) {

                int nr = r+dr[j];
                int nc = c+dc[j];


                while(!(nr < 0 || nc < 0 || nr >= 8 || nc >= 8)) {


                    map[nr][nc] = 1;


                    nr += dr[j];
                    nc += dc[j];
                }
            }
        }


        int count = 0;


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if(map[i][j] != 1) {
                    
                    count++;
                    
                }
            }
        }


        return count;
    }




    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
