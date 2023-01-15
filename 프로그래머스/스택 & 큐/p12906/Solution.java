package p12906;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      ArrayList<Integer> list = new ArrayList<Integer>();
		
		int value = -1;
		
		 for(int i = 0; i < arr.length; i++) {
		     
			 if(arr[i] != value) {
				 list.add(arr[i]);
				
			 }
			 
			 value = arr[i];
		
		 }
		 
		 int[] answer = new int[list.size()];
		 
		 for(int i = 0; i<answer.length; i++) {
			 answer[i] = list.get(i);
		 }
		 
		 return answer;
    }
}