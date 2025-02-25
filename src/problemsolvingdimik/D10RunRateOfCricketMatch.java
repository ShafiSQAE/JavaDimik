package problemsolvingdimik;

import java.util.Scanner;

public class D10RunRateOfCricketMatch {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();

        for(int i=0; i<t; i++)
        {
            int run1=scanner.nextInt();
            int run2=scanner.nextInt();
            int ballsRemaining=scanner.nextInt();

            double currentRunRate=0.00;
            double requiredRunRate=0.00;

            if(ballsRemaining<300)
            {
                currentRunRate= (double) (run2*6)/(300-ballsRemaining);
            }
            if(run2<=run1 && ballsRemaining>0)
            {
                requiredRunRate= (double) ((run1+1-run2)*6)/ballsRemaining;
            }

            System.out.printf("%.2f %.2f\n",currentRunRate,requiredRunRate);
        }
    }
}
