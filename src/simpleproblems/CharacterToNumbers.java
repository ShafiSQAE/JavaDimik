package simpleproblems;

import java.util.Scanner;

public class CharacterToNumbers {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String inputWord= scanner.nextLine();
        char[] inputWordArray=inputWord.toCharArray();
        StringBuilder stringToNumber = new StringBuilder();


        for(char ch : inputWordArray)
        {
            stringToNumber.append(ch - 'A' +1);
        }
        System.out.println(stringToNumber);

    }
}
