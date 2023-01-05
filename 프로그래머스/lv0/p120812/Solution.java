package p120812;



public class Solution {
	public static int solution(int[] array) {
        int[] num = new int[1000];
        
        for(int i = 0; i< array.length; i++) {
        	num[array[i]] += 1;
        }
        
        
        
        int max_idx = 0;
       
        
        for(int i = 1; i < num.length; i++) {
        	if(num[max_idx] < num[i]) {
        		max_idx = i;
        	}
        
        }
        
        System.out.println(max_idx); //max_idx는 최빈값

        
        for(int i = 0; i < num.length; i++) {
        	if(i != max_idx && num[max_idx] == num[i]) {
        		return -1;
        	}
        }
        
       return max_idx;
        	
    }
	
	public static void main(String[] args) {
		int[] array = {1, 1};
		System.out.println(solution(array));
	}

}
