package problemsolvingdimik;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D13TommyMiarProbablity {

    public static long factorial(int n){
        long fact=1;
        for(int i=2; i<=n; i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++)
        {
            String sentence=scanner.nextLine();
            String[] words=sentence.split(" ");
            int n= words.length;

            Map<String,Integer> wordCount= new HashMap<>();
            for(String word: words)
            {
                wordCount.put(word, wordCount.getOrDefault(word,0)+1);
            }

            long denominator= 1;
            for(int count : wordCount.values())
            {
                denominator=denominator*factorial(count);
            }
            long numerator =1;
            long totalPermutation= factorial(n)/denominator;

            System.out.println(numerator+"/"+totalPermutation);
        }

    }
}
