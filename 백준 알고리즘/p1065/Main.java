package p1065;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static int HanNum(int N) {
		
		if(N < 100) {
			return N;
		}else {
			int count;
			count = 99;
			for(int i = 100; i<=N; i++) {
				int hun =  i/ 100;
				int ten = (i / 10) % 10;
				int one =  i % 10;
				
				
				if(ten - one == hun - ten) {
					count++;
				}
				
			}
			
			return count;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		
		bw.write(String.valueOf(HanNum(N)));
		bw.flush();
		
		br.close();
		bw.close();
	}

}
