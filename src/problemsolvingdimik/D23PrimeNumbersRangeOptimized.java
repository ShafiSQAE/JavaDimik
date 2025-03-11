package problemsolvingdimik;

import java.util.Scanner;

public class D23PrimeNumbersRangeOptimized {

    static final int MAX=1000000;
    static boolean[] isPrime= new boolean[MAX+1];
    static int[] primeCount= new int[MAX+1];

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        sieveTech();

        int t=scanner.nextInt();
        for(int test=0; test<t; test++)
        {
            int a=scanner.nextInt();
            int b=scanner.nextInt();


            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            System.out.println(primeCountRang(a,b));
        }
    }

    private static void sieveTech() {
        for(int i=0; i<=MAX; i++)
        {
            isPrime[i]=true;
        }
        isPrime[0]=isPrime[1]=false;
        for(int i=2; i*i<=MAX; i++)
        {
            if(isPrime[i])
            {
                for(int j=i*i; j<=MAX; j+=i)
                {
                    isPrime[j]=false;
                }
            }
        }

        for(int i=1; i<=MAX; i++)
            primeCount[i]=primeCount[i-1] + (isPrime[i] ? 1 : 0);
    }

    private static int primeCountRang(int a, int b) {
        return primeCount[b] - (a>1 ? primeCount[a-1] : 0);
    }
}
