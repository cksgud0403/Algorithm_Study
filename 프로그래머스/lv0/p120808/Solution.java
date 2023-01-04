package p120808;

import java.util.Arrays;

class Solution {
	
	static int GCD(int a, int b) {
		int temp, n;
		
		if(a < b) { //만약 b가 더 큰 값이면 b의 값을 a로 Swap
			temp = a;
			a = b;
			b = temp;
		}
		
		while(true) {
			n = a % b;
			
			if(n == 0) {
				return b;
			}else {
				a = b;
				b = n;
			}
		}
		
	}
	
	public static int[] solution(int denum1, int num1, int denum2, int num2) {
		
		int [] answer = new int[2];
		
		//분모의 최소 공배수를 구한다. 두 분모의 곱 / 두 분모의 최대 공약수 = 두 분모의 최소 공배수
		int LCM  = (num1 * num2) /  GCD(num1, num2);
		
		//각 분자에 LCM / 자신의 분모를 해준 값을 곱한다.
		denum1 = denum1 * LCM / num1;
		denum2 = denum2 * LCM / num2;
		
		int Sumdenum = denum1 + denum2;
		
		
		//분자와 분모의 최대공약수로 약분을 해서 기약분수로 만들고 answer 배열에 분자, 분모를 삽입
		int gcd = GCD(Sumdenum, LCM);
		
		answer[0] = Sumdenum / gcd;
		answer[1] = LCM / gcd;
		
		return answer;
	}
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
	}
	
}
