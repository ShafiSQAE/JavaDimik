package RandomPractice;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        /*
        a       b      rem
        60  %   36     24
        36  %   24     12
        24  %   12     0
        12  %    0
        GCD is 12 when b=0; that means a
        */
        int a= scanner.nextInt(), b=scanner.nextInt();
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }

        while(b!=0){
            int rem= a%b;
            a=b;
            b=rem;
        }

        System.out.println("GCD= "+a);

    }
}
