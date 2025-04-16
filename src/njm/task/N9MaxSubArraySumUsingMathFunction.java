package njm.task;

import java.util.Scanner;

public class N9MaxSubArraySumUsingMathFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter elements of the Array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max= numbers[0];
        int sum= numbers[0];

        for( int i=0; i<numbers.length; i++){
            sum= Math.max(numbers[i], sum+numbers[i]);
            max= Math.max(sum,max);
        }

        System.out.println("The Maximum sum is: "+max);
    }
}
