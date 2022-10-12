package p1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String str = br.readLine();
		
		
		int[] alpabet = new int[26];
		
		for(int i = 0; i<str.length(); i++) {
			alpabet[(int)Character.toUpperCase(str.charAt(i))-65] += 1;
		}
		
		int max = 0;
		for(int i = 0; i<alpabet.length; i++) {
			if(alpabet[max] < alpabet[i]) {
				max = i;
			}
		}
		
		
		boolean is_max_multipleNum = false;
		
		for(int i = 0; i<alpabet.length; i++) {
			if(i != max && alpabet[max] == alpabet[i]) {
				is_max_multipleNum = true;
			}
			
		}
		
		
		if(is_max_multipleNum == false) {
			bw.write(max+65);
		}else {
			bw.write("?");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
