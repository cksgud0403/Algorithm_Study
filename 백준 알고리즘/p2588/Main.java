package p2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int sum = 0;
		
		System.out.println(num1 * (num2 % 10));
		
		
		sum += num1 * (num2 % 10);
		
		num2 /= 10;
		
		System.out.println(num1 * (num2 % 10));
		
		sum += num1 * (num2 % 10) * 10;
		
		
		num2 /= 10;
		
		System.out.println(num1 * (num2 % 10));
		
		sum += num1 * (num2 % 10) * 10 * 10;
		
		
		System.out.println(sum);
		
		scanner.close();

	}

}