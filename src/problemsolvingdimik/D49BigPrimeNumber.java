package problemsolvingdimik;

import java.util.Scanner;

public class D49BigPrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            long number=scanner.nextLong();

            if(isPrime(number)){
                System.out.println(number + " is a prime");
            }
            else System.out.println(number + " is not a prime");
        }
    }

    private static boolean isPrime(long n){
        if(n<2) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;

        for(int i=5; i*i<=n; i++){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
