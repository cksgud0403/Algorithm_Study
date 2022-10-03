package p1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		int max = -1;
		double sum = 0;
		String[] input;
		int[] score = new int[N];
		input = br.readLine().split(" ");
			
		for(int i = 0; i< N; i++) {
			score[i] = Integer.parseInt(input[i]);
			
			if(max < Integer.parseInt(input[i])) {
				max = Integer.parseInt(input[i]);
			}
			
		}
		
		
		for(int i = 0; i< N; i++) {
			
			sum+= (double)score[i] / max * 100;
		}
		
		
		bw.write(String.valueOf(sum/N));
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
