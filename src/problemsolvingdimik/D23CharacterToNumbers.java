package problemsolvingdimik;

import java.util.Scanner;

public class D23CharacterToNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++)
        {
            String input= scanner.nextLine();
            char[] inputChars= input.toCharArray();
            String result="";

            for(char ch : inputChars)
            {
               result+=(ch -'A' + 1);
            }

            System.out.println(result);
        }
    }

}
