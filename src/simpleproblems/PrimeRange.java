package simpleproblems;

import java.util.Scanner;

public class PrimeRange {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("There are "+primeCountInRange(a,b)+" prime numbers in the range of " +a+" to "+b);
    }

    private static int primeCountInRange(int a, int b) {
        int count=0;
        for(int i=Math.max(a,2); i<=b; i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3; i<=Math.sqrt(n); i+=2)
        {
            if(n%i==0) return false;
        }

        return true;
    }
}
