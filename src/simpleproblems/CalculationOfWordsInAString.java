package simpleproblems;

import java.util.Scanner;

public class CalculationOfWordsInAString {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String sentence= scanner.nextLine().trim();
        String[] words= sentence.split("\\s+");
        int count=0;
        for(int i=0; i<words.length; i++)
        {
            count++;
        }
        System.out.println(count);

    }
}
