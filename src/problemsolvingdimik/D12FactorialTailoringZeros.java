package problemsolvingdimik;

import java.util.Scanner;

public class D12FactorialTailoringZeros {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();
        for(int test=0; test<t; test++) {

            int n = scanner.nextInt();
            int count = 0;
            for (int i = 5; i <= n; i++) {
                count = count + n / 5;
                n = n / 5;
            }

            System.out.printf("%d\n",count);
        }
    }
}
