package problemsolvingdimik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D36SortWordsWithArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int test = 0; test < t; test++) {

            int n = scanner.nextInt();
            scanner.nextLine();

            List<String> words = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                words.add(scanner.nextLine());
            }
            Collections.sort(words);

            for (int i = 0; i < n; i++)
                System.out.println(words.get(i));
        }
    }
}
