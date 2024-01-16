package p12916;

public class Solution {
    public static boolean solution(String s) {

        int pCount = 0;
        int yCount = 0;

        for (char c : s.toCharArray()) {
            if(c == 'p' || c == 'P') {
                pCount++;
            }else if(c == 'y' || c == 'Y') {
                yCount++;
            }
        }

        return pCount == yCount;

    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));;
    }
}