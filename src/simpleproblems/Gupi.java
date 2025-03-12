package simpleproblems;

import java.util.Scanner;

public class Gupi {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int x=s.nextInt();
        int count=0;

        while(x>=1)
        {
            count++;
            x=x/2;
        }

        System.out.println(count+" days");
    }
}
