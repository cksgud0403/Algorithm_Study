package round1.p10;

public class Main {
    int solution(int[] prices){

        int inf = 1000000001; //큰 수
        int tmp = inf; // 큰 수 초기 값 ->  작은 수를 찾을 때 이용, 가장 작은 구매 가격
        int answer = -inf; // 작은 수 초기 값 ->  큰 수를 찾을 때, 최대 수익
        for(int price : prices){   //price 힌 기격
            if(tmp != inf) //초기 상태면 구매한 게 없어서 동작 안 함 (구매한 적이 있다면 동작)
                answer = Math.max(answer, price-tmp); //판매 가격 - 구매 가격
            tmp = Math.min(tmp, price); //가장 쌀 때 구매한 가격
        }
        return answer; //최대 수익
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.solution(prices1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] prices2 = {3, 1};
        int ret2 = sol.solution(prices2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
