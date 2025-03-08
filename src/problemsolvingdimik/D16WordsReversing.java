package problemsolvingdimik;

import java.util.Scanner;

public class D16WordsReversing {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int t=scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++)
        {
            String sentence=scanner.nextLine();
            String[] words=sentence.split(" ");
            String result="";

            for(String word : words)
            {
                result=result+reverseWord(word)+" ";
            }

            System.out.println(result.trim());
        }
    }

    private static String reverseWord(String word) {
        char[] chars= word.toCharArray();
        int left=0; int right=chars.length-1;

        while(left<right)
        {
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
