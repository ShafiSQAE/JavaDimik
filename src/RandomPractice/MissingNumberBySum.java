package RandomPractice;

import java.util.Scanner;

public class MissingNumberBySum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int num[] = new int[n-1];
        int sumMissing=0;
        for(int i=0; i<n-1; i++){
            num[i]=s.nextInt();
            sumMissing=sumMissing+num[i];
        }

        int sumAll= n*(n+1)/2;
        int missingNumber= sumAll-sumMissing;
        System.out.println(missingNumber);

    }
}
