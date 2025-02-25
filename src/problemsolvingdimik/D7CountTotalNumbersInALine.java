package problemsolvingdimik;

import java.util.Scanner;

public class D7CountTotalNumbersInALine {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int t=scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++)
        {
            String number= scanner.nextLine().trim();

            String processedNumber= number.trim();

            if(processedNumber.isEmpty())
            {
                System.out.println(0);
            }
            else
            {
                String[] totalNumbers= processedNumber.split("\\s+");
                System.out.println(totalNumbers.length);
            }
        }
    }
}
