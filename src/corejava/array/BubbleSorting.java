package corejava.array;

import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        performSorting(n, num);
    }

    private static void performSorting(int n, int[] num) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Sorted: ");
        for (int k = 0; k < n; k++) {
            System.out.print(num[k] + " ");
        }
    }
}
