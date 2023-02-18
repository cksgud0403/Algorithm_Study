package p1021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] numOfData = br.readLine().split(" ");
		
		String[] Datas = br.readLine().split(" ");
		
		
		int N = Integer.parseInt(numOfData[0]);
		int M  = Integer.parseInt(numOfData[1]);
		
		LinkedList<Integer> deque = new LinkedList<Integer>();
        
		for(int i = 1; i <= N; i++) {
			deque.addLast(i);
		}
		
		int sum = 0; //모든 연산의 총 합
		
		for(int i = 0; i < M; i++) {
			
			int left = 0, right = 0;
			
			int target = Integer.parseInt(Datas[i]); //현재 뽑고자 하는 원소
			
			 for (int step = 0; step < deque.size(); ++step) { //현재 뽑고자 하는 원소를 왼쪽에서 찾는다.
	                if (target == deque.get(step)) {
	                    left = step; //왼쪽 회전에 필요한 횟수를 저장한다.
	                    right = deque.size() - step; //오른쪽 회전에 필요한 횟수를 저장한다. 현재 deque 사이즈 - (왼쪽 회전 횟수)를 하면 구할 수 있다.
	                    break;
	                }
	         }
			 
			 
			 if(left < right) { //만약에 왼쪽 회전 값이 더 작다면
				 while(deque.peek() != target) {
					 deque.addLast(deque.pollFirst());
				 }
				 
				 deque.pollFirst();
				 
				 sum+= left;
			 }else { //만약에 오른쪽이 더 작거나, 둘의 값이 같다면
				 
				 while(deque.peekLast() != target) {
					 deque.addFirst(deque.pollLast());
				 }
				 
				 deque.pollLast();
				 
				 sum += right;
			 }
			
		}
		
		bw.write(String.valueOf(sum));
		
		bw.flush();
        
        br.close();
        bw.close();
       


    }

}