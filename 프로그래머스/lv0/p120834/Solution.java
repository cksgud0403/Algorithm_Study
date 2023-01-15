package p120834;

public class Solution {
	
	
    public static String solution(int age) {

    	
    	String str_age = String.valueOf(age);
    	
    	char[] result_str = new char[str_age.length()];
    	
    	
    	for(int i = 0; i < str_age.length(); i++) {
    		result_str[i] = (char)((str_age.charAt(i) - '0') + 97);
    	}
    	
    	return String.valueOf(result_str);
    }
    
    

	public static void main(String[] args) {
		System.out.println(solution(10));

	}

}
