package p1325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int max = Integer.MIN_VALUE;
        
        
        boolean[] visit = new boolean[N + 1];
        
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();

        for(int i=0; i<= N;i++){
        	adjlist.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjlist.get(b).add(a);
        }
        
        
        int[] result = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
        	
            visit = new boolean[N + 1];
            
            int count = 0;
            
            Queue<Integer> q = new LinkedList<>();
            
            q.add(i);
            visit[i] = true;
            
            while (!q.isEmpty()) {
                int v = q.poll();
                
                count++;
                
                for(int node : adjlist.get(v)){
                    if(!visit[node]){
                        q.add(node);
                        visit[node] = true;
                    }
                }

            }
            
            result[i] = count;
            
            max = Math.max(count, max);

        }
        
        for (int i = 1; i <= N; i++) {
            if (result[i] == max)
                sb.append(i+" ");
        }
        
        System.out.println(sb);

    }
}