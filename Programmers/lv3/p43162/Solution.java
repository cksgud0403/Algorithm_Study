package p43162;


public class Solution {



	public static void dfs(int start, int[][] computers, boolean[] visited) {


		visited[start] = true;

		for (int j = 0; j < computers[start].length; j++) {
			if(!visited[j] && computers[start][j] == 1) {
				dfs(j, computers, visited);
			}
		}

	}

	public static int solution(int n, int[][] computers) {

		int count = 0;

		boolean[] visited = new boolean[computers.length];

		for (int i = 0; i < computers.length; i++) {

			if(!visited[i]) {
				dfs(i, computers, visited);
				count++;
			}
		}

		return count;
    }
	
	
	public static void main(String[] args) {
		
//		int n = 3;
//		int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

		//1 1 0
		//1 1 1
		//0 1 1


		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

		System.out.println(solution(n, computers));
	}
	
}
