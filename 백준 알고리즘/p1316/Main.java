package p1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		String[] strs = new String[N];
		
		for(int i = 0; i < N; i++) {
			strs[i] = scanner.next();
		}
		
		int count = 0;
		for(int i = 0; i < strs.length; i++) {
			String str = strs[i];
			int idx;
			
			boolean groupWord = true;
			
			for(int j = 0; j < str.length(); j++) {
				idx = j;
				
				for(int k = 0; k < j; k++) {
					if(str.charAt(k) == str.charAt(j)) {
						idx = k;
					}
				}
				
				if(j-idx > 1) {
					groupWord = false;
					break;
				}
			}
			
			if(groupWord) {
				count++;
			}
		}
		
		
		System.out.println(count);
		
		scanner.close();
		
	}

}