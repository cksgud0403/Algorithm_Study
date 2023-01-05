package p120814;

public class Solution {
	
	public static int solution(int n) {
	       
        int count = 1;
        
        while(7 * count < n ) {
            count++;
        }
        
        return count;
    }

	public static void main(String[] args) {
		
		System.out.println(solution(15));
	}

}
