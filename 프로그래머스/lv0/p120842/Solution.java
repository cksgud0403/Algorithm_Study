package p120842;

import java.util.Arrays;

public class Solution {
	public static int[][] solution(int[] num_list, int n) {
      
		
		int[][] result = new int[num_list.length / n][n];
		
		
		for(int i = 0; i < num_list.length; i++) {
			result[i / n][i % n] = num_list[i];
		}
		
		
		return result;
		
    }
	
	
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(Arrays.deepToString(solution(num_list, 2)));

	}

}
