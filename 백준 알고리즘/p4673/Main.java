package p4673;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class Main {
	
	
	//매개변수로 받은 수를 생성자로 하는 수가 있으면 그 수를 거른다.
	public static int d(int number) {
		
		int sum = number;
		
		
		while(number != 0) {
			sum += number % 10;
			number /=10;
		}
		
		return sum;
	}


	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] check = new boolean[10001];
		
		for(int n = 1; n <= 10000; n++) {
			int m = d(n);
			
			
			
			if(m <= 10000) {
				check[m] = true;
			}
			
		}
		
		
	for(int i = 1; i<= 10000; i++) {
			if(check[i] == false) {
				bw.write(String.valueOf(i) + "\n");
			}
	}
		
		bw.flush();
		bw.close();
	}

}
