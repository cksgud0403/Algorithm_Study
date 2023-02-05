package p120844;

import java.util.Arrays;

public class Solution {
	
	public static int[] solution(int[] numbers, String direction) {
     
        
        int temp;
        
        if(direction.equals("left")) {
        	temp = numbers[0];
        	
        	
        	for(int i = 1; i < numbers.length; i++) {
        		numbers[i-1] = numbers[i];
        	}
        	
        	numbers[numbers.length-1] = temp;
        	
        }else {
        	temp = numbers[numbers.length-1];
        	
        	for(int i = numbers.length-2; i>=0; i--) {
        		numbers[i+1] = numbers[i];
        	}
        	
        	numbers[0] = temp;
        	
        }
        
        return numbers;
    }
	

	public static void main(String[] args) {
		
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		
		System.out.println(Arrays.toString(solution(numbers, "left")));
	}

}
