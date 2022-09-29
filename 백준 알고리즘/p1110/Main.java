package p1110;

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
		
		int Num = N;
		
		
		int length = 0;
		
		while(true) {
			
			
			int LeftNum = Num / 10;
			int RightNum = Num % 10;
			
			Num = 10 * RightNum + (LeftNum + RightNum)  % 10;
			
			length++;
			
			if(N == Num) {
				break;
			}
			
			
		}
		
		bw.write(String.valueOf(length));
		
		
		bw.flush();
		br.close();
		bw.close();
		

	}

}
