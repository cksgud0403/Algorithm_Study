package p43165;

public class Solution {
	
	public static int count = 0;
	public static int n;
	public static int[] arr;
	public static int findNum;
	
    public static int solution(int[] numbers, int target) {
    	arr = numbers;
    	n = numbers.length;
    	findNum = target;
    	
    	solve(0, 0);
    	
    	return count;
    }

	public static void solve(int L, int sum) {
		if(L == n) {
			if(sum ==  findNum) {
				count++;
			}
			
			
			return;
			
		}
		
		
		solve(L+1, sum + arr[L]);
		solve(L+1, sum - arr[L]);
		

	}
	
	
	public static void main(String args[]) {
		int[] numbers = {4, 1, 2, 1};
		
		System.out.println(solution(numbers, 4));
	}

}
