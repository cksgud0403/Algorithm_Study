package p27110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int N = scanner.nextInt();
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int count = 0;
		
		if(A < N) {
			count += A;
		}else {
			count += N;
		}
		
		if(B < N) {
			count += B;
		}else {
			count += N;
		}
		
		if(C < N) {
			count += C;
		}else {
			count += N;
		}
		
		System.out.println(count);
		
		scanner.close();

	}

}
