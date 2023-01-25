package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		char[] c = br.readLine().toCharArray();
		
		int lt = 0;
		
		int rt = c.length - 1;
		
		while(lt < rt) { //lt와 rt가 만나거나 엇갈리 때까지 반복하면서 문자들을 서로 바꿔준다.
			
			while(! (c[lt] >= 'A' &&  c[lt] <= 'Z' || c[lt] >= 'a' &&  c[lt] <= 'z')) {
				lt++;
			}
			
			while(! (c[rt] >= 'A' &&  c[rt] <= 'Z' || c[rt] >= 'a' &&  c[rt] <= 'z')) {
				rt--;
			}
			
			char temp = c[lt];
			
			c[lt] = c[rt];
			
			c[rt] = temp;
			
			lt++;
			rt--;
			
		}
		
		
		System.out.println(String.valueOf(c));

	}

}
