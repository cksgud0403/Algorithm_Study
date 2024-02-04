package p11003;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


class Node {
    int idx;
    int data;

    public Node(int idx, int data) {
        this.idx = idx;
        this.data = data;
    }


    public int getIdx() {
        return idx;
    }

    public int getData() {
        return data;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());

        int[] nums = new int[N];

        stringTokenizer = new StringTokenizer(br.readLine(), " ");


        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Deque<Node> deque = new ArrayDeque<Node>();

        for(int i = 0; i < N; i++) {


            while(!deque.isEmpty() && deque.getLast().getData() > nums[i]) {
                deque.removeLast();
            }


            deque.addLast(new Node(i+1, nums[i]));

            if((i+1) - L == deque.getFirst().getIdx()) deque.removeFirst();

            bw.write(deque.getFirst().getData() + " ");

        }


        bw.flush();

        br.close();
        bw.close();
    }
}