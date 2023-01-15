package p120826;

class Solution {
    public static String solution(String my_string, String letter) {
    	
    	
    	
    	for(int i = 0; i < letter.length(); i++) {
    		
    		for(int j = 0; j < my_string.length(); j++) {
    			if(my_string.charAt(j) == letter.charAt(i)) {
        			my_string = my_string.replace(String.valueOf(my_string.charAt(j)), "");
        		}
    		}
    		
    	}
    	
    	return my_string;
    }
    
    
    public static void main(String args[]) {
    	System.out.println(solution("abcdef", "f"));
    }
}
