package dfs_and_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4 {
	
	public static int[] fibo;
	
	public static int solution(int n) {
		
		if(n == 2 || n == 1) {
			return 1;
		}
		
		return solution(n-1) + solution(n-2);
	}
	
	//시간을 더 줄이는 방법 1
	public static int solution_1(int n) {
		if(n == 2 || n == 1) {
			return fibo[n] = 1;
		}
		
		return fibo[n] = solution_1(n-1) + solution_1(n-2);
	}
	
	//시간을 더 줄이는 방법 2
	public static int solution_2(int n) {
		
		if(fibo[n] > 0) { //이미 값이 구해져 있다면
			return fibo[n];
		}
		
		if(n == 2 || n == 1) {
			return fibo[n] = 1;
		}
		
		return fibo[n] = solution_1(n-1) + solution_1(n-2);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
//		for(int i = 1; i <= N; i++) {
//			System.out.print(solution(i) + " ");
//		}
		
		fibo = new int[N + 1]; //인덱스 1부터 사용
//		
//		solution_1(N);
//		
		
//		for(int i = 1; i <= N; i++) {
//			System.out.print(fibo[i] + " ");
//		}
		
		
		solution_2(N);
		
		for(int i = 1; i <= N; i++) {
			System.out.print(fibo[i] + " ");
		}
		

	}

}
