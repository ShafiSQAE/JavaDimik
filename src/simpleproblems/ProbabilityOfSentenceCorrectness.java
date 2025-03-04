package simpleproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.WeakHashMap;

public class ProbabilityOfSentenceCorrectness {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String sentence= scanner.nextLine();
        String[] words= sentence.split(" ");
        int n=words.length;
        System.out.println(n);

        Map<String,Integer> wordCount= new HashMap<>();

        for(String word : words)
        {
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }

        long denominator=1;
        for(int count : wordCount.values())
        {
            denominator= denominator*factorial(count);
        }
        System.out.println(denominator);

        long nominator=1;
        long totalPermutation= factorial(n)/denominator;
        System.out.println(totalPermutation);

        System.out.println("Probability is: "+nominator+"/"+totalPermutation);

        System.out.println(factorial(5));

    }

    public static long factorial(int count) {
        long fact=1;
        for(int i=1; i<=count; i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
