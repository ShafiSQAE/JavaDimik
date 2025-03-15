package problemsolvingdimik;

import java.util.Scanner;

public class D39PalindromeWithStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int test = 0; test < t; test++) {

            String input = scanner.nextLine();

            StringBuilder rev = new StringBuilder(input).reverse();

            if (input.contentEquals(rev)) {
                System.out.println("Yes! It is palindrome!");
            } else System.out.println("Sorry! It is not palindrome!");
        }
    }
}
