package simpleproblems;

import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String sentence= scanner.nextLine();
        char[] chars= sentence.toCharArray();

        int count=0;
        for(int i=0; i<chars.length; i++)
        {
            if("aeiou".indexOf(Character.toLowerCase(chars[i])) != -1)
            {
                count++;
            }
        }

        System.out.println("The number is vowels in the sentence is: "+count);
    }
}
