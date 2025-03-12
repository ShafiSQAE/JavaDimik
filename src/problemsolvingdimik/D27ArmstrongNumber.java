package problemsolvingdimik;

import java.util.Scanner;

public class D27ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();
        for(int test=0; test<t; test++) {

            int n = scanner.nextInt();
            int insertedNumber = n;
            int sum = 0;

            while (n > 0) {
                int lastDigit= n%10;
                sum += Math.pow(lastDigit, 3);
                n = n / 10;
            }

            if (insertedNumber == sum) {
                System.out.println(insertedNumber + " is an armstrong number!");
            } else {
                System.out.println(insertedNumber + " is not an armstrong number!");
            }
        }
    }
}
