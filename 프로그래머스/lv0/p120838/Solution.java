package p120838;

public class Solution {
	
	 public static String solution(String letter) {
	        
		 	String[] morse = { 
		 		    ".-","-...","-.-.","-..",".","..-.",
		 		    "--.","....","..",".---","-.-",".-..",
		 		    "--","-.","---",".--.","--.-",".-.",
		 		    "...","-","..-","...-",".--","-..-",
		 		    "-.--","--.."
		 		};
		 	
		 	
		 	String[] words = letter.split(" ");
		 	
		 	StringBuilder sb = new StringBuilder();
		 	
		 	for(int i = 0; i < words.length; i++) {
		 		String word = words[i];
		 		
		 		for(int j = 0; j < morse.length; j++) {
		 			if(word.equals(morse[j])) {
		 				sb.append((char)(j + 'a'));
		 			}
		 		}
		 	}
		 	
			return sb.toString();
	    }

	public static void main(String[] args) {
		System.out.println(solution(".--. -.-- - .... --- -."));

	}

}
