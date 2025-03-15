package simpleproblems;

import java.util.Scanner;

public class PalindromeSimpleLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isPalindrome = true;
        int len = input.length();
        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Yes! It is palindrome!");
        } else {
            System.out.println("Sorry! It is not palindrome!");
        }

    }

}
