package p10951;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			String[] num = input.split(" ");
			
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			
			bw.write(A+B + "\n");
		}
		
				
		br.close();
		bw.close();
	}

}
