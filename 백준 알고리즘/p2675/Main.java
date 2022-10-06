package p2675;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<T; i++) {
			String[] input = br.readLine().split(" ");
			int r = Integer.parseInt(input[0]);
			String str = input[1];
			
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < r; k++) {
					bw.write(str.charAt(j));
				}
			}
			
			bw.write("\n");
			
		}
		
		
		
		bw.flush();
		bw.close();
		br.close();
	}

}
