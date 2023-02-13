package p120846;

public class Solution {
	 public static int solution(int n) {
	       
		 int CompositeNumberCount = 0;
		 for(int i = 4; i <= n; i++) {
			 int count = 0;
			 
			 for(int j = 1; j <= i; j++) {
				 if(i % j == 0) {
					 count++;
				 }
			 }
			 
			 
			 if(count >=3) {
				 CompositeNumberCount++;
			 }
		 }
		 
		 
		 return CompositeNumberCount;
		 
	    }
	 
	public static void main(String[] args) {
		System.out.println(solution(15));

	}

}
