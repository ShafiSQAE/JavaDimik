package simpleproblems;

import java.util.Scanner;

public class CharacterDetermination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);
        int ascii = (int) ch;


        if (ascii >= 65 && ascii <= 90) {
            System.out.println("Uppercase Character");
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println("Lowercase Character");
        } else if (ascii >= 48 && ascii <= 57) {
            System.out.println("Numerical Digit");
        } else
            System.out.println("Special Character");
    }
}
