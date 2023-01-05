package p120817;

public class Solution {
	public static double solution(int[] numbers) {
        int sum = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        return ((double)sum / numbers.length) * 10 / (double)10;
    }
	
	public static void main(String[] args) {
		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println(solution(numbers));

	}

}
