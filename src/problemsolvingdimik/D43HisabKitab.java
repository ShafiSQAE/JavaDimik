package problemsolvingdimik;

import java.math.BigInteger;
import java.util.Scanner;

public class D43HisabKitab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int c = scanner.nextInt();

            BigInteger P = BigInteger.valueOf(p);
            BigInteger Q = BigInteger.valueOf(q);
            BigInteger C = BigInteger.valueOf(c);

            BigInteger result = P.modPow(Q, C);
            System.out.println("Result = " + result);
        }
    }
}
