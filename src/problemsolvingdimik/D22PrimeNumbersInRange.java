package problemsolvingdimik;

import java.util.Scanner;

public class D22PrimeNumbersInRange {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();
        for(int test=0; test<t; test++)
        {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(primeNumberInRange(a,b));
        }
    }

    private static int primeNumberInRange(int a, int b) {
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
        for(int i=3; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
