package dfs_and_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_6 {
	
	static int N;
	static int[] ch; //체크 배열
	
	public static void solution(int n) {
		if(n == N+1) {
			String tmp = "";
			for(int i = 1; i <= N; i++) {
				if(ch[i] == 1) {
					tmp += (i + " ");
				}
			}
			
			
			if(tmp.length() > 0) System.out.println(tmp);
		
		}else {
			ch[n] = 1;
			solution(n + 1); //왼쪽으로 뻗어나감
			ch[n] = 0;
			solution(n + 1); //오른쪽으로 뻗어나감
		}
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		ch = new int[n + 1];
		
		N = n;
		
		
		solution(1);

	}

}
