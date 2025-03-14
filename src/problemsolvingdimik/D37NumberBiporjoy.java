package problemsolvingdimik;

import java.util.Scanner;

public class D37NumberBiporjoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            int reversed = 0;

            while (n != 0) {
                int rem = n % 10;
                reversed = reversed * 10 + rem;
                n = n / 10;
            }
            System.out.println(reversed);
        }
    }
}

