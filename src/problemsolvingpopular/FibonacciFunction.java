package problemsolvingpopular;

import java.util.Scanner;

public class FibonacciFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        fibonacci(n);
    }

    private static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Enter an integer number greater than Zero");
        } else if (n == 1) {
            System.out.println("0");
        } else {
            int first = 0, second = 1;
            System.out.print(first + " " + second + " ");
            for (int i = 2; i < n; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }
}
