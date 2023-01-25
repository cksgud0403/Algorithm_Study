package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] words = br.readLine().split(" ");
		
		int maxWordIdx = 0;
		
		for(int i = 1; i < words.length; i++) {
			if(words[maxWordIdx].length() < words[i].length()) {
				maxWordIdx = i;
			}
		}
		
		
		System.out.println(words[maxWordIdx]);

	}

}
