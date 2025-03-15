package problemsolvingdimik;

import java.util.Scanner;

public class D40SumOfSeries1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int x = scanner.nextInt(), k = scanner.nextInt();
            long sum = 0;
            for (int i = 0; i <= k; i++) {
                sum = sum + (long) Math.pow(x, i);
            }
            System.out.println("Result = " + sum);
        }
    }
}
