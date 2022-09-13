package p3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		int[] a = new int[6];
		
		for(int i = 0; i < 6; i++) {
			int num = scanner.nextInt();
			a[i] = num;
		}
		
		
		int[] count = {1 ,1 ,2, 2 , 2, 8};
		
		
		for(int i = 0; i< 6; i++) {
			System.out.print(count[i]- a[i]);
			System.out.print(" ");
		}
		
		scanner.close();
	}

}