package problemsolvingdimik;

import java.util.Scanner;

public class D17VowelCounting {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int t=scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++)
        {
            String sentence= scanner.nextLine();
            char[] chars= sentence.toCharArray();
            int count=0;
            for(char ch : chars)
            {
                if("aeiouAEIOU".indexOf(ch) != -1)
                {
                    count++;
                }
            }

            System.out.println("Number of vowels = "+count);
        }
    }
}
