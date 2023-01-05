package p120815;

public class Solution {
	public static int solution(int n) {
        int count = 1;
        
        while(6 * count % n != 0){
            count++;
        }
        
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(10));

	}

}
