package p2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] datas = br.readLine().split(" ");
		
		int a = Integer.valueOf(datas[0]);
		int b = Integer.valueOf(datas[1]);
		
		
		
		//최대 공약수
		
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		
		int max = 0;
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				max = i;
			}
		}
		
		System.out.println(max);
		
		//최소공배수 = 두 수의 곱 / 최대 공약수
		
		System.out.println(a * b / max);
		
	}

}
