package p120813;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++) {
        	if(i % 2 != 0) {
        		list.add(i);
        	}
        }
        
        
        int[] answer = new int[list.size()];
        
        
        for(int i = 0; i< answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(15)));

	}

}
