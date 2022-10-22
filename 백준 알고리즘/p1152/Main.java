import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String str = br.readLine();
		
		
		int count = 0;
		
		
		for(int i = 1; i< str.length(); i++) {
			if(str.charAt(i-1) != ' ' && str.charAt(i) == ' ') {
				count +=1;
			}
		}
		
		if(str.charAt(str.length()-1) == ' ') {
			count -=1;
		}
		
		
		bw.write(String.valueOf(count+1));
		
		
		bw.flush();
		
		br.close();
		bw.close();

	}

}
