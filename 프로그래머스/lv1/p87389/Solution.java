package p87389;

public class Solution {
    public static int solution(int n) {
        int min = Integer.MAX_VALUE;
        int i = 1;

        while(true) {
            if(n % i  == 1) {
                break;
            }

            i++;
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}