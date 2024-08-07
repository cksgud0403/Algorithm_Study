package round2.p10;

public class Main {


    public String solution(String s) {

        s += '#';
        String answer = "";
        for(int i = 0; i < s.length(); ++i){
            if ((s.charAt(i) == '0' && s.charAt(i+1) != '0')) //'01', '0#'
                answer += "0";
            else if(s.charAt(i) == '1') { //'1', s[i] == '0' && s[i+1] == '0'
                answer += "1";
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main sol = new Main();
        String s = "101100011100";
        String ret = sol.solution(s);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }

}
