package simpleproblems;

import java.util.Scanner;

public class TailoringZeroOfAFactorial {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int number= scanner.nextInt();
        int count=0;
        for(int i=5; i<=number; i=i*5)
        {
            count=count+ (number/i);
        }
        System.out.println("The factorial of "+number+" has "+count+" tailoring Zeros");
    }
}
