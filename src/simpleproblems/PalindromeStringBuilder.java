package simpleproblems;

import java.util.Scanner;

public class PalindromeStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        StringBuilder rev = new StringBuilder(input).reverse();

        if (input.contentEquals(rev)) {
            System.out.println("Yes! It is palindrome!");
        } else System.out.println("Sorry! It is not palindrome!");
    }
}
