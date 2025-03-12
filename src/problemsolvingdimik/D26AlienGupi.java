package problemsolvingdimik;

import java.util.Scanner;

public class D26AlienGupi {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();
        for(int test=0; test<t; test++)
        {
            float x=scanner.nextFloat();
            int count=0;
            while(x>=1)
            {
                count++;
                x=x/2;
            }

            System.out.println(count+" days");

        }
    }
}
