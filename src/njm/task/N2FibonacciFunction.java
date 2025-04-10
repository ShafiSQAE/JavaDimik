package njm.task;

import java.util.Scanner;

public class N2FibonacciFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        showFibonacci(n);
    }

    private static void showFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Enter a number greater than Zero");
        } else if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0 1");
        } else {
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;

            }
        }
    }
}
