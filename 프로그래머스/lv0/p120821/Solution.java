package p120821;

import java.util.Arrays;

public class Solution {
	public static int[] solution(int[] num_list) {
       int[] num = new int[num_list.length];
       
       
       for(int i = num_list.length-1; i >= 0; i--) {
    	   num[num_list.length-1-i] = num_list[i];
       }
       
       return num;
    }
	

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(solution(num_list)));
	}

}
