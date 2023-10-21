package string;

import java.io.*;

public class Solution_11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		str += " ";

		int count = 1;

		StringBuilder stringBuilder = new StringBuilder();


		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}else {

				stringBuilder.append(str.charAt(i));

				if(count >= 2) {
					stringBuilder.append(count);
				}

				count = 1;
			}
		}

		bw.append(stringBuilder.toString());

		bw.flush();


		br.close();
		bw.close();

	}

}
