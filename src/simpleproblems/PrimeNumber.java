package simpleproblems;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();

        if(num<2)
        {
            System.out.println("Not prime");
        }

        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                System.out.println("Not prime");
            }
            else
            {
                System.out.println("Prime");
            }
            break;
        }
    }
}
