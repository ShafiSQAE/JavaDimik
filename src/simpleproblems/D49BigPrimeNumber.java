package simpleproblems;

import java.util.Scanner;

public class D49BigPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // টেস্ট কেস সংখ্যা

        while (t-- > 0) {
            long n = scanner.nextLong();  // বড় সংখ্যা ইনপুট

            if (isPrime(n)) {
                System.out.println(n + " is a prime");
            } else {
                System.out.println(n + " is not a prime");
            }
        }
        scanner.close();
    }

    // মৌলিক সংখ্যা চেক করা
    private static boolean isPrime(long n) {
        if (n < 2) return false;  // 2 এর চেয়ে ছোট সংখ্যা প্রাইম নয়
        if (n == 2 || n == 3) return true;  // 2 ও 3 প্রাইম
        if (n % 2 == 0 || n % 3 == 0) return false;  // জোড় সংখ্যা বা 3-এর গুণিতক হলে প্রাইম নয়

        // 6k ± 1 নিয়ম মেনে চেক করা
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
