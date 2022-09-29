package p10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		
		
		int max = Integer.parseInt(input[0]);
		int min = Integer.parseInt(input[0]);
		
		
		for(int i = 0; i < N; i++) {
			if(max < Integer.parseInt(input[i])) {
				max = Integer.parseInt(input[i]);
			}
			
			if(min > Integer.parseInt(input[i])) {
				min = Integer.parseInt(input[i]);
			}
			
		
		}
		
		bw.write(min + " " + max);
		
		bw.flush();
		
		br.close();
		bw.close();
		
	}

}
