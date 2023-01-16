package p120837;

public class Solution {
	public static int solution(int hp) {
        int result = 0;
        
        
        int[] ant = new int[3];
        
        ant[0] = 5;
        ant[1] = 3;
        ant[2] = 1;
        
        
        for(int i = 0; i < 3; i++) {
        	result += hp / ant[i];
        	hp = hp % ant[i];
        }
		return result;
    }
	
	
	public static void main(String[] args) {
		
		System.out.println(solution(999));
	}

}
