package round1.p5;


public class Main {

    public int solution(int n) {


        // 1. 소용돌이 만드는 것

        int[][] arr = new int[n][n];

        int loop = n; //해당 방향으로 채우는 숫자 개수
        int dir = 0; //방향 0 1 2 3


        //좌표의 초기값
        int r =  0;
        int c = -1;

        //방향에 대한 r, c의 변량
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int num = 0;

        for(int i = 0; i < (n * 2) - 1; i++) {

            for(int j = 1; j <= loop; j++) {
                r += dr[dir];
                c += dc[dir];

                num += 1;

                arr[r][c] = num;
            }

            dir = (dir + 1) % 4; //방향을 바꾸는 코드

            if(dir % 2 == 1) loop -= 1; //dir(방향)이 홀수 값일 때 반복 횟수가 -1 감소

        }


        //2. 대각선 상에 존재하는 숫자들을 구하는 것

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        

        return sum;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int n1 = 3;
        int ret1 = sol.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = sol.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");


    }
}
