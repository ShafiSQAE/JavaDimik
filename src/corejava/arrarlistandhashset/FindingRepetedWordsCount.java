package corejava.arrarlistandhashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingRepetedWordsCount {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String sentence=scanner.nextLine();
        String[] words= sentence.split(" ");
        int numberOfWords= words.length;
        System.out.println("Total number of words in the sentence is: "+numberOfWords);

        Map<String, Integer> wordCount= new HashMap<>();
        for(String word: words)
        {
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }

        int count=0;
        for(int j: wordCount.values())
        {
            if(j>1) {
                count++;
            }

        }
        System.out.println("Total repeted Words are: "+count);

    }
}
