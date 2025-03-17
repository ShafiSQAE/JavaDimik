package simpleproblems;

import java.util.Scanner;

public class D44PascalsTriangleWithArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            int n = scanner.nextInt();
            int[][] pascal = new int[n][n];

            if (n > 20) {
                continue;
            }

            for (int i = 0; i < n; i++) {
                pascal[i][0] = 1;
                for (int j = 1; j <= i; j++) {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j > 0) System.out.print(" ");
                    System.out.print(pascal[i][j]);
                }
                System.out.println();
            }
            if (test < t - 1) {
                System.out.println();
            }
        }
    }
}
