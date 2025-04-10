package corejava.array;

import java.util.Scanner;

public class ArrayInputOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many numbers do you want to enter: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter "+n+" numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers are: ");
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
