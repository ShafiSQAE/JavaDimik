package corejava.array;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int[] numbers=new int[n];
        int max=numbers[0];

        for(int i=0; i<n; i++){
            numbers[i]=scanner.nextInt();
        }

        for(int j=1; j<n; j++) {
            if (numbers[j]>max) {
                max = numbers[j];
            }
        }
        System.out.println(max);
    }
}
