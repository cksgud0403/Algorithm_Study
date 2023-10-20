package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		str = str.toLowerCase();

		int left = 0;

		int right = str.length() - 1;

		while (left < right) {


			if (!Character.isAlphabetic(str.charAt(left))) {
				left++;
			} else if (!Character.isAlphabetic(str.charAt(right))) {
				right--;
			}else {
				if (str.charAt(left) != str.charAt(right)) {
					System.out.println("NO");
					return;
				}else {
					left++;
					right--;
				}
			}

		}

		System.out.println("YES");


		br.close();


	}

}
