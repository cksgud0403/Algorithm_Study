package p10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i<k; i++) {
			int num = scanner.nextInt();
			
			if(num == 0) {
				s.pop();
			}else {
				s.add(num);
			}
		}
		
		int sum = 0;
		
		while(!s.isEmpty()) {
			sum += s.pop();
		}
		
		System.out.println(sum);
		scanner.close();

	}

}
