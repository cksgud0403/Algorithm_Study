package p120833;

public class Solution {
	public int[] solution(int[] numbers, int num1, int num2) {
        
        int size = num2-num1 + 1;
        
        int[] arr = new int[size];
        
        for(int i = 0; i < size; i++) {
            arr[i] = numbers[num1+i];
        }
        
        return arr;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
