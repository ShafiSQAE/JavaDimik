package problemsolvingdimik;

import java.util.Scanner;

public class D29CharacterDetermination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int test = 0; test < t; test++) {

            char ch = scanner.next().charAt(0);
            int ascii = (int) ch;


            if (ascii >= 65 && ascii <= 90) {
                System.out.println("Uppercase Character");
            } else if (ascii >= 97 && ascii <= 122) {
                System.out.println("Lowercase Character");
            } else if (ascii >= 48 && ascii <= 57) {
                System.out.println("Numerical Digit");
            } else
                System.out.println("Special Characters"); //in Dimik 'Special Character' is there. But online judge accepts 'Special Characters'
        }
    }
}
