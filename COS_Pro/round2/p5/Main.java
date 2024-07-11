package round2.p5;

public class Main {

    public int solution(int[] arr) {


        ///숫자가 연속해서 증가하는 가장 긴 구간의 길이를 return 해주세요.
        //길이가 2 이상인 증가하는 구간이 없다면 1을 return 해주세요.



        int length = 1;

        int prev = arr[0];

        int count = 1;

        for(int i = 1; i < arr.length; i++) {

            if(prev < arr[i]) {

                count++;

            }else {

                length = Math.max(length, count);



                count = 1;
            }

            prev = arr[i];
        }


        return length;
    }


    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
