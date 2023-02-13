package p25556;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
		
		for(int i = 0; i < 4; i++) {
			stacks.add(new Stack<Integer>());
		}
		
		
		for(int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			
			int idx = 0;
			
			while(idx < stacks.size()) {
				if(stacks.get(idx).isEmpty() || !stacks.get(idx).isEmpty() && stacks.get(idx).peek() < num) {
					stacks.get(idx).push(num);
					break;
				}else {
					idx++;
				}
			}
			
			if(idx == stacks.size()) {
				System.out.println("NO");
				scanner.close();
				return;
			}
			
		}
		
		
		System.out.println("YES");
		
		scanner.close();
		
	}

}
