package p1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int w = scanner.nextInt();
        int h = scanner.nextInt();


        int distance = Math.min(Math.min(h - y, y), Math.min(w - x, x));

        System.out.println(distance);
    }
}
