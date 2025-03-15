package simpleproblems;

import java.util.Scanner;

public class SumOfSeries2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (i / factorial(i));
        }
        System.out.printf("%.4f\n", sum);
    }

    private static double factorial(int num) {
        double fact = 1.0;
        if (num == 0) return 0;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
