package p120840;

import java.math.BigInteger;

public class Solution {
	
	
    public static int solution(int balls, int share) {
		
    	return combination(balls, share);
	}
    
    
    public static int combination(int n, int r) {
    	
    	
    	BigInteger[] factorial = new BigInteger[31]; //0! ~ 30!까지
    	
    	factorial[0] = new BigInteger("1");
    	factorial[1] = new BigInteger("1");
    	
    	
    	//2! ~ 30!까지 모든 값을 구한다.
    	for(int i = 2; i <= 30; i++) {
    		factorial[i] = factorial[i-1].multiply(new BigInteger(Integer.toString(i)));
    	}
    	
    	
    	// n! / (n-r)! x r!를 구한다.
    	return factorial[n].divide(factorial[n-r].multiply(factorial[r])).intValue();
    }
	

	
	public static void main(String[] args) {
		
		
		System.out.println(solution(6, 3));

	}

}
