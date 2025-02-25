package problemsolvingdimik;

import java.util.Scanner;

public class D2EvenOdd {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int t=scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for(int i=0; i<t; i++)
        {
            /*As the problem states an integer could have 100 digits so we can't take input as integer.
            We need to take input as a String.
            - first we will find the last character(digit) of that string
            -convert it to integer by using ASCII conversion which includes subtracting '0' from character
            -then will check that digit is divisible by 2 or not
            - logic is: if the last digit of any number is divisible by 2 then the number is even
             */
            String number=scanner.nextLine(); //this line will take input as string
            char lastDigit=number.charAt(number.length()-1); //this line will find the last character(digit)

            if((lastDigit - '0')%2==0) //lastDigit - '0' will convert character to digit by ASCII calculation
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
