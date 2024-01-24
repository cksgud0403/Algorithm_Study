package p12912;

public class Solution {
    public static long solution(int a, int b) {
       return (a > b) ? (a-b+1) * (long)(a+b) / 2 : (b-a+1) * (long)(a+b) / 2;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3));;
    }
}