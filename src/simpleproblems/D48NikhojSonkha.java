package simpleproblems;

import java.util.Scanner;


public class D48NikhojSonkha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // Number of test cases

        while (t-- > 0) {
            long n = scanner.nextInt();  // Expected number count

            long expectedSum = n * (n + 1) / 2;  // Sum of 1 to N
            long actualSum = 0;

            for (int i = 0; i < n - 1; i++) {
                actualSum += scanner.nextInt();  // Sum of given numbers
            }

            System.out.println(expectedSum - actualSum);  // Print missing number
        }

        scanner.close();
    }
}
