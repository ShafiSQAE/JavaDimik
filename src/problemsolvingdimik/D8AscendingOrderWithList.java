package problemsolvingdimik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D8AscendingOrderWithList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int test = 1; test <= t; test++) {

            List<Integer> numbers = new ArrayList<>(); // Create a list to store integers

            for (int i = 0; i < 3; i++) {
                numbers.add(scanner.nextInt());

            }
            Collections.sort(numbers);

            System.out.print("Case " + test + ": ");
            for (int j = 0; j < numbers.size(); j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(numbers.get(j));
            }

            System.out.println();
        }

    }
}
