package round2.p6;

import java.util.*;

public class Main {

    public int[] solution(String commands) {

        int[] answer = {0, 0};


        for (char c : commands.toCharArray()) {

            if(c == 'L') {
                answer[0] += -1;
            }else if(c == 'R') {
                answer[0] += 1;
            }else if(c == 'U') {
                answer[1] += 1;
            }else if(c == 'D') {
                answer[1] += -1;
            }

        }


        return answer;

    }



    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
