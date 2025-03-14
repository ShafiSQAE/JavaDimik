package problemsolvingdimik;

import java.util.Arrays;
import java.util.Scanner;

public class D36SortWordsWithArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String[] words = new String[n];

            for(int i=0; i<n; i++){
                words[i]=scanner.nextLine();
            }

            Arrays.sort(words);

            for(int j=0; j<words.length; j++){
                System.out.println(words[j]);
            }

        }
    }
}
