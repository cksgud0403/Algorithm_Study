package p10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[] str = br.readLine().split(" ");;
		
		int N = Integer.parseInt(str[0]);
		int X = Integer.parseInt(str[1]);
		
		String[] nums = br.readLine().split(" ");;

		
		for(int i = 0; i<N; i++) {
			
			if(Integer.parseInt(nums[i]) < X) {
				bw.write(nums[i] + " ");
			}
		}
		
		
		bw.flush();
		bw.close();
		
	}

}
