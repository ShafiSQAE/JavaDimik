package simpleproblems;

import java.util.Scanner;

public class LCMWithGCDFunction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(lcm(a, b));

    }

    private static long gcd(long a, long b) {
        if (a < b) {
            long temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            long rem = a % b;
            a = b;
            b = rem;
        }

        return a;
    }

    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
