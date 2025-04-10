package corejava.array;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n=scanner.nextInt();
        int[] num= new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            num[i]=scanner.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(num[j] > num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted numbers: ");
        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }
    }
}
