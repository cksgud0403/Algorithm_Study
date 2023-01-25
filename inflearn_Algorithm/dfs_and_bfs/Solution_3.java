package dfs_and_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_3 {
	
	
	public static int solution(int n ) {
		
		if(n == 0) {
			return 1;
		}
		
		return n * solution(n - 1);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(solution(N));
	}

}
