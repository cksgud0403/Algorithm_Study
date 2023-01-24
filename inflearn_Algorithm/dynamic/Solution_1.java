package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		int[] dy = new int[N + 1];
		
		
		dy[1] = 1;
		dy[2] = 2;
		
		
		for(int i = 3; i <= N; i++) {
			dy[i] = dy[i-1] + dy[i-2];
		}
		
		
		System.out.println(dy[N]);

	}

}
