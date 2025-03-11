package problemsolvingdimik;

import java.util.Scanner;

public class D20ReverseLettersOfWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t=scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++) {

            String word = scanner.nextLine();
            revWord(word);
            System.out.println();
        }
    }


    public static void revWord(String word) {

        char[] letters=word.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            char temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;
            left++;
            right--;
        }

        for (char ch : letters) {
            System.out.print(ch);

        }

    }
}
