package p120824;

public class Solution {
	public int[] solution(int[] num_list) {
        
		int[] nums = new int[2];
		
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				nums[0]++;
			}else {
				nums[1]++;
			}
		}
		
		return nums;
    }
	 
	 
	public static void main(String[] args) {
		
		
	}

}
