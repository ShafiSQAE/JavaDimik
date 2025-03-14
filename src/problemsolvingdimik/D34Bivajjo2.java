package problemsolvingdimik;

import java.util.Scanner;

public class D34Bivajjo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result= new StringBuilder();

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            long c=scanner.nextLong();
            long LCM= lcm(a,b);

            if(LCM>c){
                continue;
            }


            for(long i=LCM; i<=c; i+=LCM){
                result.append(i).append("\n");
            }

            if(test<t-1){
                result.append("\n");
            }
        }
        System.out.print(result);
    }

    private static long lcm(int a, int b) {
        if(a==0 || b==0) return 0;
        return ((long)a*b)/gcd(a,b);
    }

    private static long gcd(int a, int b) {
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }

        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }

        return a;
    }
}
