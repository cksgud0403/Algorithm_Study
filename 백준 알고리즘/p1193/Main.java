package p1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		
		int cross_count = 1, prev_count_sum = 0;
		
		while(true) {
			if(X <= prev_count_sum + cross_count) {
				if (cross_count % 2 == 0) {	// 대각선의 개수가 짝수라면 
					
					
					//분자, 분모 값의 합(cross_count + 1) - 분자의 값(X - prev_count_sum) = 분모의 값((cross_count + 1) - (X - prev_count_sum))
					System.out.print((X - prev_count_sum) + "/" + ((cross_count + 1) - (X - prev_count_sum)));
					break;
				} else {
					System.out.print(((cross_count + 1) - (X - prev_count_sum)) + "/" + (X - prev_count_sum));
					break;
				}
			}
			
			prev_count_sum += cross_count;
			cross_count++;
			
		}
		
		scanner.close();

	}
}
