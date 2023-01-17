package p120841;

public class Solution {

	public static int solution(int[] dot) {
		int position = 0;
		if(dot[0] > 0 && dot[1] > 0) {
			position = 1;
		}else if(dot[0] < 0 && dot[1] > 0) {
			position = 2;
		}else if(dot[0] < 0 && dot[1] < 0) {
			position = 3;
		}else if(dot[0] > 0 && dot[1] < 0) {
			position = 4;
		}
		
		return position;
	}
	public static void main(String[] args) {
		int[] dot = {-7, 9};
		System.out.println(solution(dot));
	}

}
