package problemsolvingdimik;

import java.util.Scanner;

public class D1EvenOdd {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


        int t= scanner.nextInt();

        for(int i=0; i<t; i++)
        {
            int n=scanner.nextInt();
            if(n%2==0)
            {
                System.out.println("even");
            }
            else
            {
                System.out.println("odd");
            }
        }

    }
}
