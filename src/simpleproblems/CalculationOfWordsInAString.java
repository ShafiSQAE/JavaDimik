package simpleproblems;

import java.util.Scanner;

public class CalculationOfWordsInAString {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String sentence= scanner.nextLine().trim();
        String[] words= sentence.split("\\s+");
        int count=0;
        if(sentence.isEmpty())
        {
            System.out.println(0);
        }
        else {

            System.out.println(words.length);
        }

    }
}
