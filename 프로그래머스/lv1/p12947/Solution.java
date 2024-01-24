package p12947;

public class Solution {
    public static boolean solution(int x) {
       int sum = 0;

       int num = x;

        while(num != 0) {
            sum += (num % 10);
            num /= 10;
        }

        return (x % sum == 0 );
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}