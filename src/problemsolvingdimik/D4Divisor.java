package problemsolvingdimik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D4Divisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int testCase = 1; testCase <= t; testCase++) {
            int n = scanner.nextInt();
            List<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    if (i != n / i) {
                        divisors.add(n / i);
                    }
                }
            }
            Collections.sort(divisors);
            System.out.print("Case " + testCase + ": ");
            for (int i = 0; i < divisors.size(); i++) {
                if(i>0) System.out.print(" ");
                System.out.print(divisors.get(i));
            }
            System.out.println();
        }
    }

}
