package problemsolvingdimik;

import java.util.Arrays;
import java.util.Scanner;

public class D47MergeTwoArraySimpleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            int n1 = scanner.nextInt();
            int[] arr1 = new int[n1];
            for (int i = 0; i < n1; i++) {
                arr1[i] = scanner.nextInt();
            }
            int n2 = scanner.nextInt();
            int[] arr2 = new int[n2];
            for (int j = 0; j < n2; j++) {
                arr2[j] = scanner.nextInt();
            }

            int[] mergedArr = new int[n1 + n2];

            int k = 0;

            for (int i = 0; i < n1; i++) {
                mergedArr[k] = arr1[i];
                k++;
            }

            for (int j = 0; j < n2; j++) {
                mergedArr[k] = arr2[j];
                k++;
            }

            Arrays.sort(mergedArr);

            for (int l = 0; l < mergedArr.length; l++) {
                if (l > 0) System.out.print(" ");
                System.out.print(mergedArr[l]);
            }
            System.out.println();
        }
    }
}
