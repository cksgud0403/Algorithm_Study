package p12934;

public class Solution {
    public static long solution(long n) {

        long answer = 0;

        for(long x = 1; x*x<=n; x++){
            if(x*x==n){
                answer = (x+1)*(x+1);
            }else
                answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));;
    }
}