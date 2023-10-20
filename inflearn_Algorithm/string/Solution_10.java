package string;

import java.io.*;

public class Solution_10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		String[] s = br.readLine().split(" ");

		String str = s[0];

		String targetStr = s[1];

		StringBuilder stringBuilder = new StringBuilder();

		for(int i = 0; i < str.length(); i++) {
			int min_dis = Integer.MAX_VALUE;
			int startIdx = 0;
			int idx;

			while((idx = str.indexOf(targetStr, startIdx)) != -1) {
				if(Math.abs(i-idx) < min_dis) {
					min_dis = Math.abs(i-idx);
				}

				startIdx = idx+1;

			}

			stringBuilder.append(min_dis);

			if (i != str.length() - 1) {
				stringBuilder.append(" ");
			}

		}


		bw.append(stringBuilder);

		bw.flush();

		bw.close();
		br.close();

	}

}
