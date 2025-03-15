package problemsolvingdimik;

import java.util.Scanner;

public class D42SumOfSeris3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int test = 0; test < t; test++) {

            int k = scanner.nextInt();
            if (k == 0) {
                System.out.println("1");
            } else if (k == 1) {
                System.out.println("2 + 1");
            } else {
                for (int i = k; i > 1; i--) {
                    System.out.print("2^" + i + " + ");
                }
                System.out.println("2 + 1");
            }
        }

    }
}
