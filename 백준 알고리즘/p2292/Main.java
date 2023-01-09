package p2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		
		int num = 2;
		int range = 6;
		int count = 1;
		
		
		if(X == 1) {
			System.out.println(count);
		}else {
			while(true) {
				if(num <= X && X <= num + (range-1)) {
					count++;
					break;
				}
				
				num += range;
				range += 6;
				count++;
			}
			
			
			System.out.println(count);
		}
		
		scanner.close();

	}

}
