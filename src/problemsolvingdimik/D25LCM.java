package problemsolvingdimik;

import java.util.Scanner;

public class D25LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            System.out.println("LCM = " + lcm(a, b));
        }
    }

    private static long lcm(int a, int b) {
        if(a==0 || b==0) return 0;
        return ((long) a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
