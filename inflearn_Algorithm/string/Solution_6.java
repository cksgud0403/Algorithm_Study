package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_6 {
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			
			boolean isDuplication = true;
			for(int j = 0; j < i; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					isDuplication = false;
				}
			}
			
			if(isDuplication) {
				bw.append(str.charAt(i));
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
