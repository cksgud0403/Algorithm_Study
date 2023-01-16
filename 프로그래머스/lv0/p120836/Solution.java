package p120836;

public class Solution {
	
	public static int solution(int n) {
        
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		
		return count;
    }
	
	
	public static void main(String[] args) {
		System.out.println(solution(20));
	}

}
