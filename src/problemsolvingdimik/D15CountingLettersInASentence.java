package problemsolvingdimik;

import java.util.Scanner;

public class D15CountingLettersInASentence {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int t=scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++) {

            String sentence = scanner.nextLine();
            int[] freq = new int[26];

            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                freq[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                if (freq[j] > 0) {
                    System.out.println((char) (j + 'a') + " = " + freq[j]);
                }
            }

            if(test<t-1)
            {
                System.out.println();
            }

        }
    }
}
