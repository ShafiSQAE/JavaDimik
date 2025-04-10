package njm.task;

import java.util.Scanner;

public class N3ParenthesisBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

    }

    private static boolean isBalanced(String input) {
        int balance = 0;

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                balance++;
            } else if (ch == ')' || ch == '}' || ch == ']') {
                balance--;
                if (balance < 0) return false;
            }
        }
        return balance == 0;

    }
}
