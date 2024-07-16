package round3.p4;



import java.util.*;





public class Main {

    public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;


        int len = Math.min(s1.length(), s2.length()); //둘 문자열 증에 작은 문자열이 길이를 구한다.

        int overlapLength = 0;


        for(int i = 0; i < len; i++) {

            String substring1 = s1.substring(0, i + 1); //앞
            String substring2 = s2.substring(s2.length() - 1 - i); //뒤

            if(substring1.equals(substring2)) {
                overlapLength=Math.max(overlapLength,i+1);
            }


        }



        for(int i = 0; i < len; i++) {

            String substring1 = s2.substring(0, i + 1); //앞
            String substring2 = s1.substring(s1.length() - 1 - i); //뒤

            if(substring1.equals(substring2)) {
                overlapLength=Math.max(overlapLength,i+1);
            }


        }

        answer = s1.length() + s2.length() - overlapLength;


        return answer;
    }



    public static void main(String[] args) {
        Main sol = new Main();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
