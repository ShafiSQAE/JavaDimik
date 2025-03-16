package simpleproblems;

import java.util.Scanner;

public class D44PascalsTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            long n = scanner.nextInt();
           if(n<1 || n>20){
               continue;
           }

            for (long i = 0; i < n; i++) {
                long number = 1;
                for (long j = 0; j <= i; j++) {
                    if(j>0) System.out.print(" ");
                    System.out.print(number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
            if(test<t-1)
            System.out.println();
        }
    }
}
