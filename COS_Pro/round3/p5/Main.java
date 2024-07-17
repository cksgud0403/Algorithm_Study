package round3.p5;

public class Main {

    public String solution(String phrases, int second) {
        // 여기에 코드를 작성해주세요.

        String answer = "______________" + phrases;

        for (int i = 0; i < second; i++) {
            answer = answer.substring(1) + answer.charAt(0);
        }


        return answer.substring(0, 14);
    }


    public static void main(String[] args) {
        Main sol = new Main();
        String phrases = new String("happy-birthday");
        int second = 3;
        String ret = sol.solution(phrases, second);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}
