package problemsolvingdimik;

import java.util.Scanner;

public class D15Extented {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        String sentence= scanner.nextLine();

        System.out.println("Total Characters including spaces: "+sentence.length());
        int[] freq= new int[128];

        for(int i=0; i<sentence.length(); i++)
        {
            char c= sentence.charAt(i);
            freq[c]++;
        }

        for(char c='0'; c<='9'; c++)
        {
            if(freq[c]>0)
            {
                System.out.println(c+" = "+freq[c]);
            }
        }

        for(char c='a'; c<='z'; c++)
        {
            if(freq[c]>0)
            {
                System.out.println(c + " = " + freq[c]);
            }
        }

        for(char c='A'; c<='Z'; c++)
        {
            if(freq[c]>0)
            {
                System.out.println(c + " = " +freq[c]);
            }
        }

        for(char c=0; c<128; c++)
        {
            if(!Character.isLetterOrDigit(c) && freq[c]>0)
            {
                System.out.println(c + " = " +freq[c]);
            }
        }
    }
}
