package p10829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void solution(long n) {
		if(n == 0) {
			return;
		}
		
		solution(n / 2);
		
		System.out.print(n % 2);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 long N = Long.parseLong(br.readLine());
		
		solution(N);
		

	}

}
