package njm.task;

import simpleproblems.Sort;

import java.util.Scanner;

public class N6FindMissingNumberInList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the last number of the range: ");
        int n=scanner.nextInt();

        int[] arr=new int[n-1];
        System.out.println("Enter "+ (n-1 +" numbers from 1 to "+n+":"));
        int sum=0;
        for(int i=0; i<n-1; i++){
            arr[i]=scanner.nextInt();
            sum=sum+arr[i];
        }

        int total= (n*(n+1))/2;
        int missingNumber= total-sum;

        System.out.print("The missing number is: "+missingNumber);
    }
}
