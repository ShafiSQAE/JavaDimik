package problemsolvingdimik;

import java.util.Scanner;

public class D10RunRate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int test = 0; test < t; test++) {

            double firstInnRuns = scanner.nextDouble();
            double secondInnRuns = scanner.nextDouble();
            double ballsLeft = scanner.nextDouble();

            double currentRate =  secondInnRuns / ((300-ballsLeft)/6.00);
            double requiredRate;

            if(secondInnRuns>firstInnRuns)
            {
                requiredRate=0.00;
            }
            else
            {
                requiredRate= (((firstInnRuns - secondInnRuns)+1)) / ((ballsLeft)/6);
            }

            System.out.printf("%.2f %.2f\n",currentRate,requiredRate);

        }
    }
}
