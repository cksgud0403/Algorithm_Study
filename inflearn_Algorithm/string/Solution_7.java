package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_7 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int left = 0;
		int right = str.length()-1;


		while(left < right) {

			if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
				System.out.println("NO");
				br.close();
				return;
			}

			left++;
			right--;

		}

		System.out.println("YES");

		br.close();

	}

}
