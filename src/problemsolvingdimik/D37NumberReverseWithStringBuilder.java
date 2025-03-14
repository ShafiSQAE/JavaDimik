package problemsolvingdimik;

import java.util.Scanner;

public class D37NumberReverseWithStringBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int test = 0; test < t; test++) {
            String number = scanner.nextLine();
            StringBuilder rev = new StringBuilder(number).reverse();
            long reversed= Long.parseLong(rev.toString());
            System.out.print(reversed);

            if (test < t - 1) {
                System.out.println();
            }
        }
    }
}
