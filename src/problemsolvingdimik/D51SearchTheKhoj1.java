package problemsolvingdimik;

import java.util.Scanner;

public class D51SearchTheKhoj1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int test = 0; test < t; test++) {

            String input = scanner.nextLine();

            String[] inputString = input.split(" ", 2);

            String mainString = inputString[0];
            String subString = inputString[1];

            int count = findIndex(mainString, subString);
            System.out.println(count);

        }
    }

    private static int findIndex(String mainString, String subString) {
        int mainLen = mainString.length();
        int subLen = subString.length();

        boolean found;

        for (int i = 0; i <= mainLen - subLen; i++) {
            found = true;
            for (int j = 0; j < subLen; j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }
}
