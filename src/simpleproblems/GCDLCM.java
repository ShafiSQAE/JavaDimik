package simpleproblems;

import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println("GCD = " + calculateGCD(a, b));
        System.out.println("LCM = " + calculateLCM(a, b));
    }

    private static long calculateLCM(long a, long b) {
        if(a==0 || b==0) return 0;
        return (a*b)/calculateGCD(a,b);
    }

    private static long calculateGCD(long a, long b) {
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


}
