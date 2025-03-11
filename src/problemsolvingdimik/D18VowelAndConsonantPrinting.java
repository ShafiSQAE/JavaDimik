package problemsolvingdimik;

import java.util.Scanner;

public class D18VowelAndConsonantPrinting {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++)
        {
            String sentence= scanner.nextLine();
            char[] chars = sentence.toCharArray();
            String vowel="";
            String consonant="";

            for(char ch : chars) {
                if (Character.isLetter(ch)) {
                    if ("aeiou".indexOf(ch) != -1) {
                        vowel += ch;
                    } else {
                        consonant += ch;
                    }
                }
            }


            System.out.println(vowel+"\n"+consonant);
            //System.out.println(consonant);

        }
    }
}
