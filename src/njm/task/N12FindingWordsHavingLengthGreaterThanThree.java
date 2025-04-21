package njm.task;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class N12FindingWordsHavingLengthGreaterThanThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> words = Arrays.asList(input.split("\\s+"));

        List<String> longWords = words.stream()
                .filter(word -> word.length() > 3)
                .collect(Collectors.toList());

        System.out.println("Words with length > 3 : " + longWords.size());
        System.out.println("These words are: " + longWords);
    }
}
