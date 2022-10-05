package p10809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String str= br.readLine();
		
		int[] alpabet = new int[26];
		
		for(int i = 0; i<alpabet.length; i++) {
			alpabet[i] = -1;
		}
		
		
		
		for(int i = 0; i<str.length(); i++) {
			
			int idx = (int)str.charAt(i)-97;
			if(alpabet[idx] == -1) {
				alpabet[idx] = i;
			}
		}
		
		
		for(int i = 0; i<26; i++) {
			bw.write(String.valueOf(alpabet[i]) + " ");
		}
		
		
		bw.flush();
		br.close();
		
	}

}
