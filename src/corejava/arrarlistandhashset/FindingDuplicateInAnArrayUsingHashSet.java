package corejava.arrarlistandhashset;

import java.util.HashSet;
import java.util.Scanner;

public class FindingDuplicateInAnArrayUsingHashSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integer numbers: ");
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
            System.out.println("No duplicate Number");
        } else {
            System.out.println("Duplicate number/s: " + duplicates);
        }
    }
}
