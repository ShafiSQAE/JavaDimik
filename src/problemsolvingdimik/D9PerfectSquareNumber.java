package problemsolvingdimik;

import java.util.Scanner;

public class D9PerfectSquareNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int test = 1; test <= t; test++) {

            int number = scanner.nextInt();

            int sqrRoot = (int) Math.sqrt(number);

            if (number < 0) {
                System.out.println("NO");
            } else if (sqrRoot * sqrRoot == number) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
