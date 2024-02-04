package p12891;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");


        int S = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());

        String DNA = br.readLine();

        stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int[] minCount = new int[4];

        for (int i = 0; i < 4; i++) {
            minCount[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int left = 0;

        int count = 0;
        int[] Count = new int[4];


        for (int right = 0; right < P; right++) {
            if(DNA.charAt(right) == 'A') {
                Count[0]++;
            }else if(DNA.charAt(right) == 'C') {
                Count[1]++;
            }else if(DNA.charAt(right) == 'G') {
                Count[2]++;
            }else if(DNA.charAt(right) == 'T') {
                Count[3]++;

            }
        }

        boolean flag = true;

        for(int i = 0; i < 4; i++) {
            if (Count[i] < minCount[i]) {
                flag = false;
            }
        }

        if(flag) {
            count++;
        }

        for(int i = left + P; i <= S-1; i++) {


            if(DNA.charAt(left) == 'A') {
                Count[0]--;
            }else if(DNA.charAt(left) == 'C') {
                Count[1]--;
            }else if(DNA.charAt(left) == 'G') {
                Count[2]--;
            }else if(DNA.charAt(left) == 'T') {
                Count[3]--;

            }

            left++;

            if(DNA.charAt(i) == 'A') {
                Count[0]++;
            }else if(DNA.charAt(i) == 'C') {
                Count[1]++;
            }else if(DNA.charAt(i) == 'G') {
                Count[2]++;
            }else if(DNA.charAt(i) == 'T') {
                Count[3]++;

            }


            flag = true;

            for(int j = 0; j < 4; j++) {
                if (Count[j] < minCount[j]) {
                    flag = false;
                }
            }

            if(flag) {
                count++;
            }

        }

        bw.write(String.valueOf(count));

        bw.flush();

        br.close();
        bw.close();
    }
}