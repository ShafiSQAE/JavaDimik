package problemsolvingdimik;

import java.util.Scanner;

public class D6SumOfFirstAndLastDigit {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int t=scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<t; i++) {

            String number = scanner.nextLine();
            char firstDigit = number.charAt(0);
            char lastDigit = number.charAt(number.length() - 1);

            int sum = (firstDigit - '0') + (lastDigit - '0');
            System.out.println("Sum = "+sum);

        }
    }
}
