package dfs_and_bfs;

import java.util.Scanner;

public class Solution_1 {
	
	
	public static void solution(int n) {
		
		if(n == 0) {
			return;
		}

		solution(n-1);
		
		System.out.print(n + " ");
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		
		solution(N);
		
		
		scanner.close();

	}

}
