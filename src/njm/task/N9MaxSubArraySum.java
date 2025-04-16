package njm.task;

import java.util.Scanner;

public class N9MaxSubArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max= Integer.MIN_VALUE;
        int sum=0;

        for( int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];

            if(numbers[i] > sum){   //[-2, 1, 4]
                sum= numbers[i];
            }
            if(sum>max){
                max=sum;
            }
        }

        System.out.println(max);
    }
}
