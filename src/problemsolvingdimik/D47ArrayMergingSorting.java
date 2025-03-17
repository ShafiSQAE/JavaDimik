package problemsolvingdimik;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class D47ArrayMergingSorting {

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

            int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                    .sorted()  // Optional: If you want sorted output
                    .toArray();


            for (int k = 0; k < mergedArray.length; k++) {
                if (k > 0) System.out.print(" ");
                System.out.print(mergedArray[k]);
            }

            System.out.println();
        }
    }
}