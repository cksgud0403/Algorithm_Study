package p2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] dice = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			dice[i] = scanner.nextInt();
		}
		
		
		if(dice[0] == dice[1] && dice[1] == dice[2]) {
			System.out.println(10000 + dice[0] * 1000);
		}else if(dice[0] == dice[1] || dice[0] == dice[2]) {
			System.out.println(1000 + dice[0] * 100);
		}else if(dice[1] == dice[2]) {
			System.out.println(1000 + dice[1] * 100);
		}else {
			
			int max = dice[0];
			for(int i = 0; i<dice.length; i++) {
				if(max < dice[i]) {
					max = dice[i];
				}
			}
			
			System.out.println(max*100);
		}

		
		scanner.close();
	}

}
