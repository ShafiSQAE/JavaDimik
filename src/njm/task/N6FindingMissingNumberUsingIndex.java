package njm.task;

import java.util.Arrays;
import java.util.Scanner;

public class N6FindingMissingNumberUsingIndex {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the value of n (the last number) :");
        int n=scanner.nextInt();

        System.out.println("Enter "+(n-1)+" numbers from 1 to "+n+" :");
        int arr[]= new int[n-1];

        for(int i=0; i<n-1; i++){
            arr[i]=scanner.nextInt();
        }

        Arrays.sort(arr);

        int missing=n;

        for(int i=0; i<n-1; i++){
            if(arr[i]!=i+1){
                missing=i+1;
            }
        }

        System.out.print("This missing number is: "+missing);
    }
}
