package p120825;

public class Solution {
	public static String solution(String my_string, int n) {
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i = 0; i < my_string.length(); i++) {
			for(int j = 0; j < n; j++) {
				sb.append(my_string.charAt(i));
			}
		}
       
		return sb.toString();
		
		
    }
	 
	 
	public static void main(String[] args) {
		System.out.println(solution("hello", 3));
	}

}
