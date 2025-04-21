package njm.task;

import java.util.Scanner;

public class N10FindingMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the last value n: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n - 1];
        int inputSum = 0;

        System.out.println("Enter " + (n - 1) + " numbers from 1 to " + n + " : ");
        for (int i = 0; i < n - 1; i++) {
            numbers[i] = scanner.nextInt();
            inputSum = inputSum + numbers[i];
        }

        int actualSum = n * (n + 1) / 2;

        int missingNumber = actualSum - inputSum;
        System.out.println("The missing number from 1 to " + n + " is : " + missingNumber);
    }
}
