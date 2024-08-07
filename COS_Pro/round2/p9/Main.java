package round2.p9;

public class Main {
    public boolean solution(String password) {

        int length = password.length();
        for(int i = 0; i < length - 2; ++i){
            int firstCheck = password.charAt(i + 1) - password.charAt(i); //98-99 = -1
            int secondCheck = password.charAt(i+2) - password.charAt(i+1);//97-98 = -1
            if(firstCheck == secondCheck && (firstCheck == 1 || firstCheck == -1))
                return false; //연속된 세 개
        }
        return true;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String password1 = "cospro890";
        boolean ret1 = sol.solution(password1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");


        String password2 = "cba323";
        boolean ret2 = sol.solution(password2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2+ " 입니다.");
    }

}
