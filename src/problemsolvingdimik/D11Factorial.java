package problemsolvingdimik;

import java.util.Scanner;

public class D11Factorial {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int t=scanner.nextInt();

        for(int test=0; test<t; test++){

            int n=scanner.nextInt();
            long fact=1;

            if(n==0)
            {
                System.out.println(1);
            }
            else
            {
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out.println(fact);
            }

        }

    }
}
