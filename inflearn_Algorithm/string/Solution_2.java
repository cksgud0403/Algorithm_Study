package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for (char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) { //대문자라면
				System.out.print(Character.toLowerCase(c));
			}else {
				System.out.print(Character.toUpperCase(c));
			}
		}

	}

}
