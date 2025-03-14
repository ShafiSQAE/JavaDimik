package simpleproblems;

import java.util.Scanner;

public class Bivajjo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            long start = (a % c == 0) ? a : a + (c - a % c);
            if(start>b){
                continue;
            }

            for (long i = start; i <= b; i+=c) {
                if (i % c == 0) {
                    result.append(i).append("\n");
                }
            }
            if (test < t - 1) {
                result.append("\n");
            }
        }
        System.out.print(result);
    }
}
