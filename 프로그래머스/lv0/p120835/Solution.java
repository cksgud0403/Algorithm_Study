package p120835;

import java.util.ArrayList;
import java.util.Arrays;

class MaxHeap  {
	ArrayList<Integer> heap ;
	
	public MaxHeap() {
		this.heap = new ArrayList<Integer>();
		this.heap.add(0);
	}
	
	
	public void insert(int data) {
		this.heap.add(data);

		int idx = this.heap.size() - 1;
		
		//현재 삽입된 위치의 노드 값이 부모보다 크다면
		while(idx > 1 && this.heap.get(idx) > this.heap.get(idx / 2)) {
			int ParentVal = this.heap.get(idx / 2);
			this.heap.set(idx / 2, this.heap.get(idx));
			this.heap.set(idx, ParentVal);
			idx /= 2;
		}
	}
	
	
	
	public Integer delete() {
	
		
	if(this.heap.size() == 1) {
		return null;
	}else {
		int target = this.heap.get(1);	
		
		
		this.heap.set(1, this.heap.get(this.heap.size()-1));
		
		this.heap.remove(this.heap.size() - 1);
		
		int idx = 1;
		
		
		while(true) {
			int leftIdx = idx * 2;
			int rightIdx = idx * 2 + 1;
			
			int targetIdx = -1;
			
			if(rightIdx < this.heap.size()) {
				targetIdx = this.heap.get(leftIdx) < this.heap.get(rightIdx) ? rightIdx : leftIdx;
			}else if(leftIdx < this.heap.size()) {
				targetIdx = leftIdx;
			}else {
				break;
			}
			
			if(this.heap.get(targetIdx) > this.heap.get(idx)) {
				int ParentVal = this.heap.get(idx);
				this.heap.set(idx, this.heap.get(targetIdx));
				this.heap.set(targetIdx, ParentVal);
				idx = targetIdx;
			}else {
				break;
			}
		}
		
		return target;
	}
	
	}
}



public class Solution {
	
		  public static int[] solution(int[] emergency) {
		       
		        
		        MaxHeap maxheap  = new MaxHeap();
		        
		        
		        for(int i = 0; i < emergency.length; i++) { //먼저 emergency에 있는 데이터들을 힙에다가 넣는다.
		        	maxheap.insert(emergency[i]);
		        }
		        
		        int[] nums = new int[101]; //0부터 100까지의 각 숫자들의 순서를 저장하기 위한 배열이다.
		        
		        
		        
		        for(int i = 1 ; i <= emergency.length; i++) {  //emergency에 있는 데이터 숫자 만큼 힙에 있는 데이터들을 삭제한다. i는 순서를 뜻한다.
		        	nums[maxheap.delete()] = i;
		        }
		        
		        int[] answer = new int[emergency.length]; //숫자들의 순서들을 return 하기 위한 배열이다.
		        
		        
		        for(int i = 0; i < emergency.length; i++) { //emergency에 있는 데이터의 각 숫자들의 순서를 answer 배열에 넣는다.
		        	answer[i] = nums[emergency[i]];
		        }
		        
		        return answer;
		  }

		public static void main(String[] args) {
			int[] emergency = {30, 10, 23, 6, 100};
			System.out.println(Arrays.toString(solution(emergency)));
	
		}

	}
