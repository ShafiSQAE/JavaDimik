package simpleproblems;

import java.util.Scanner;

public class D44PascalsTriangleStringBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {


            int n = scanner.nextInt();

            if(n<1 || n>20){
                continue;
            }

            for (int i = 0; i < n; i++) {
                long number = 1;
                for (int j = 0; j <= i; j++) {
                    if (j > 0) result.append(" "); //System.out.print(" ");
                    result.append(number); //System.out.print(number);
                    number = number * (i - j) / (j + 1);
                }
                result.append("\n");
            }
            if (test < t - 1) {
                result.append("\n");
            }

        }
        System.out.print(result);
        scanner.close();

    }
}
