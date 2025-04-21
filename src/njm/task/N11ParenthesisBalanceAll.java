package njm.task;

import java.util.Scanner;

public class N11ParenthesisBalanceAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll("[^(){}\\[\\]]","");

        // Remove all characters except (), {}, []
        //input = input.replaceAll("[^(){}\\[\\]]", "");

        String prev;
        do {
            prev = input;
            input = input.replace("()", "")
                    .replace("{}", "")
                    .replace("[]", "");
        } while (!input.equals(prev));

        if (input.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}