package simpleproblems;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();


        /* a= 60 , b= 36  a%b
           60  %   36  =   24
           36  %   24  =   12
           24  %   12  =   0
           12   %   0  =

           GCD     12  (When b==0 then a is GCD)
         */

        if (a < b) {
            long temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            long rem = a % b;
            a = b;
            b = rem;
        }

        System.out.println(a);
    }
}
