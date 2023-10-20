package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] str = br.readLine().toCharArray();

		StringBuilder stringBuilder = new StringBuilder();

		for (char c : str) {
			if(Character.isDigit(c)) {
				stringBuilder.append(c);
			}
		}

		System.out.println(Integer.valueOf(stringBuilder.toString()));

		br.close();

	}

}
