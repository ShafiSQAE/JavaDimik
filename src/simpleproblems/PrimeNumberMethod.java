package simpleproblems;

import java.util.Scanner;

public class PrimeNumberMethod {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        if(isPrime(n))
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }

    private static boolean isPrime(int n) {
        if(n<2)
            return false;
        if(n==2)
            return true;
        if(n%2==0)
            return false;

        for(int i=3; i<Math.sqrt(n); i=i+2)
        {
            if(n%i==0)
                return false;
        }

        return true;
    }
}
