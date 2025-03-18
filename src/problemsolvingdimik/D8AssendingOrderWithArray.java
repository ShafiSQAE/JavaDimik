package problemsolvingdimik;

import java.util.Arrays;
import java.util.Scanner;

public class D8AssendingOrderWithArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int test = 1; test <= t; test++) {

            int[] nums = new int[3];

            for (int i = 0; i < 3; i++) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            System.out.print("Case " + test + ": ");
            for (int i = 0; i < 3; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(nums[i]);
            }
            System.out.println();

        }
    }
}
