package p4344;

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
			
			int N = Integer.parseInt(input[0]);
			
			
			int sum = 0;
			
			for(int j = 1; j <= N; j++) {
				sum += Integer.parseInt(input[j]);
			}
			
			int count = 0;
			
			for(int j = 1; j <= N; j++) {

				if(Integer.parseInt(input[j]) > (sum / N)) {
					count++;
				}
			}
			
			double Ratio = (double )count / N * 100;
			
			bw.write(String.format("%.3f", Math.round(Ratio * 1000) / (double)1000) + "%\n");
			
		}
		
		bw.flush();
		
		br.close();
		bw.close();
		
	}

}
