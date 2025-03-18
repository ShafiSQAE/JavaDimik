package problemsolvingdimik;

import java.util.Scanner;

public class D11FactorialWithFactorialFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            int n = scanner.nextInt();
            System.out.println(factorial(n));
        }
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
