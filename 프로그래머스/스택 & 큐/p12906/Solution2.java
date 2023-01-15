package p12906;

import java.util.Arrays;
import java.util.Stack;

class Solution2 {
	 public static int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		 
		
		for(int i = 0 ; i < arr.length; i++) {
			if(stack.isEmpty() || stack.peek() != arr[i]) {
				stack.add(arr[i]);
			}
		}
		
		 int[] answer = new int[stack.size()];
		 
		 for(int i = 0; i < stack.size(); i++) {
			 answer[i] = stack.get(i);
		 }
		 
		 return answer;
}
	 
	 
	 
	 public static void main(String args[]) {
		 int arr[] = {4,4,4,3};
		 System.out.println(Arrays.toString(solution(arr)));
	 }
}
