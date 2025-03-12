package simpleproblems;

import java.util.Scanner;

public class ArrayInputOutput {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int[] numbers= new int[n];

        for(int i=0; i<numbers.length; i++)
        {
            numbers[i]= scanner.nextInt();
        }

        for(int i=1; i<numbers.length; i=i+2)
        {
            System.out.print(numbers[i]+" ");
        }
    }
}
