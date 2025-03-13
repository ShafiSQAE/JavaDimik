package problemsolvingdimik;

import java.util.Scanner;

public class D28ArraySortedOrNot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int test = 0; test < t; test++) {

            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            if (isSorted(numbers)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }

    private static boolean isSorted(int[] num) {
        boolean assen = true, dessen = true;

        for (int i = 1; i < num.length; i++) {
            if (num[i] < num[i - 1]) assen = false;
            if (num[i] > num[i - 1]) dessen = false;
        }
        return assen || dessen;
    }
}
