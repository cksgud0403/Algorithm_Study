package round1.p6;

public class Main {

    public int solution(String pos) {


        //1. 좌표 값으로 바꾸기
        int c = (pos.charAt(0) - 'A');
        int r = ((pos.charAt(1)) - '0') - 1;

        //2. 8방향 돌며 좌표, 제스판 내부 / 외부 내부인것만 Count

        int[] dr = {2, 1,  -1, -2, -2, -1, 1, 2};
        int[] dc = {1, 2, 2, 1, -1, -2, -2, -1};

        int count = 0;

        for(int i = 0; i < 8; i++) {

            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr < 0 || nc < 0 || nr >= 8 || nc >= 8) continue;

            count++;

        }
        return count;
    }


    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String pos = "A7";
        int ret = sol.solution(pos);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
