package simpleproblems;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong(), b = scanner.nextLong();
        long inputA = a;
        long inputB = b;

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

        long lcm=(inputA*inputB)/a;
        System.out.println(lcm);
    }
}
