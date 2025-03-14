package simpleproblems;

import java.util.Scanner;

public class Gunitok {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder result= new StringBuilder();

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            long x = scanner.nextLong();
            long n = scanner.nextLong();

            if (x > n) {
                result.append("Invalid!\n");
            }

                long limit=n/x;
                for (long i = 1; i <= limit; i++) {
                    result.append(x*i).append("\n");
                }

            if(test<t-1){
                result.append("\n");

        }
        }

        System.out.print(result);

    }
}
