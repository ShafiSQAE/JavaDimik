package njm.task;

import java.util.HashSet;
import java.util.Scanner;

public class N8FindingDuplicateNumberInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No Duplicate");
        } else {
            System.out.println("Duplicate Numbers: " + duplicates);
        }

    }
}
