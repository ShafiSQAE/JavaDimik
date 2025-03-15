package problemsolvingdimik;

import java.util.Scanner;

public class D38HirokRajjo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    if (j > 0) System.out.print(" ");
                    System.out.print(x);
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    if (j > 0) System.out.print(" ");
                    System.out.print(x);
                }
                System.out.println();
            }
            if (test < t - 1)
                System.out.println();
        }
    }
}
