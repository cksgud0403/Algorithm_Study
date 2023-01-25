package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<String> answer = new ArrayList<>();
		
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
		
			int lt = 0;
			
			int rt = str.length()-1;
			
			
			char[] s = str.toCharArray();
			
			while(lt < rt) { //lt와 rt가 만나거나 엇갈리 때까지 반복하면서 문자들을 서로 바꿔준다.
				char temp = s[lt];
				s[lt] = s[rt];
				s[rt] = temp;
				
				lt++;
				rt--;
			}
			
			answer.add(String.valueOf(s));
			
		}
		
		
		for(String s : answer) {
			System.out.println(s);
		}
		
		

	}

}
