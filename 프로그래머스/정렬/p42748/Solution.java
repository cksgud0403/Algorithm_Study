package p42748;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        
             int[] answer = new int[commands.length];
        
                for(int i = 0; i< commands.length; i++) {
                    
                //정렬 되지 않는 배열 구간의 원소가 저장될 임시 배열 생성
                    
                int no_sorted_length = commands[i][1]-commands[i][0] +1;
                    
                int[] no_sorted = new int[no_sorted_length];
                    
                
                int no_sorted_idx = 0;
                    
                    //정렬 되지 않는 배열의 원소들을 임시 배열에 저장
                for(int j = commands[i][0]; j <= commands[i][1]; j++) {
                    no_sorted[no_sorted_idx++] = array[j-1];
                }
                    
                    
                    
                // selection sort O(n^2)
                for(int k = 0; k < no_sorted_length-1; k++) {
                    int mid_idx = k;
                    
                    for(int l = k+1; l<no_sorted_length; l++) {
                        if(no_sorted[l] < no_sorted[mid_idx]) {
                            mid_idx = l;
                        }
                    }
                    
                    
                    // Swap
                     int temp = no_sorted[k];
                     no_sorted[k] = no_sorted[mid_idx];
                     no_sorted[mid_idx] = temp;
                    
                }
                
                // answer insert data
               
                    
                answer[i] = no_sorted[commands[i][2] - 1];
            
            }
        return answer;
    }
    
    
    public static void main(String args[]) {
    	int[] array = {1, 5, 2, 6, 3, 7, 4};
    	
    	int[][] commands = {
    			{2, 5, 3},
    			{4, 4, 1}, 
    			{1, 7, 3}
    	};
    	
    	solution(array, commands);
    }
}