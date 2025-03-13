package problemsolvingdimik;

import java.util.Scanner;

public class D29CharacterRecognitionUsingFunction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int test = 0; test < t; test++) {

            char ch = scanner.next().charAt(0);

            if (Character.isUpperCase(ch)) {
                System.out.println("Uppercase Character");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("Lowercase Character");
            } else if (Character.isDigit(ch)) {
                System.out.println("Numerical Digit");
            } else System.out.println("Special Characters"); //There is a wrong statement in Dimik 's'
        }
    }
}
