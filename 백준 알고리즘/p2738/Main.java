package p2738;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		int[][] matrixA = new int[N][M];
		int[][] matrixB = new int[N][M];
		
		for(int i = 0; i < matrixA.length; i++) {
			for(int j = 0; j < matrixA[i].length; j++) {
				matrixA[i][j] = scanner.nextInt();
			}
		}
		
		
		for(int i = 0; i < matrixB.length; i++) {
			for(int j = 0; j < matrixB[i].length; j++) {
				matrixB[i][j] = scanner.nextInt();
			}
		}
		
		StringBuilder b = new StringBuilder();
		
		for(int i = 0; i < matrixB.length; i++) {
			for(int j = 0; j < matrixB[i].length; j++) {
				b.append(matrixA[i][j]  + matrixB[i][j]);
				if(j != matrixB[i].length-1) {
					b.append(" ");
				}
			}
			if(i != matrixB.length-1) {
				b.append("\n");
			}
		}
		
		System.out.print(b.toString());

	}

}
