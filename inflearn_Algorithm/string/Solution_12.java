package string;

import java.io.*;

public class Solution_12 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(br.readLine());

		String str = br.readLine();

		StringBuilder binary = new StringBuilder();

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n * 7; i++) {

			if (str.charAt(i) == '#') {
				binary.append("1");
			} else if (str.charAt(i) == '*') {
				binary.append("0");
			}

			if((i + 1) % 7 == 0) {

				int num = Integer.parseInt(binary.toString(), 2);

				result.append((char) num);

				binary.setLength(0);
			}


		}

		bw.append(result);

		bw.flush();

		br.close();
		bw.close();

	}

}
