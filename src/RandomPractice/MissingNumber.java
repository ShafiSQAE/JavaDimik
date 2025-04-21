package RandomPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter last number: ");
        int n=scanner.nextInt();

        int[] num= new int[n-1];

        System.out.println("Enter "+(n-1)+" numbers from 1 to "+n+" :");
        for(int i=0; i<n-1; i++){
            num[i]=scanner.nextInt();
        }

        Arrays.sort(num);

        int missing=n;
        for(int i=0; i<n-1; i++){
            if(num[i]!=i+1){
                missing=i+1;
                break;
            }
        }

        System.out.println("The missing number from 1 to "+n+" is: "+missing);
    }
}
