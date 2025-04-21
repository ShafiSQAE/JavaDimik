package RandomPractice;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        isPalindrome(input);
    }

    private static void isPalindrome(String input) {
        char[] inputArr = input.toCharArray();

        int left = 0;
        int right = inputArr.length - 1;

        while (left < right) {
            char temp = inputArr[left];
            inputArr[left] = inputArr[right];
            inputArr[right] = temp;
            left++;
            right--;
        }

        String rev = new String(inputArr);

        if (input.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
