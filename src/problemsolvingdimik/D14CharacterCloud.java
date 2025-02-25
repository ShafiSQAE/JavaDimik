package problemsolvingdimik;

import java.util.Scanner;

public class D14CharacterCloud {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int t= scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++) {

            String sentence = scanner.nextLine();
            char ch = scanner.nextLine().charAt(0);

            char[] sentenceArray = sentence.toCharArray();
            int count = 0;
            for (int i = 0; i < sentenceArray.length; i++) {
                if (ch == sentenceArray[i]) {
                    count++;
                }
            }

            if (count > 0) {
                //Occurrence of 'l' in 'hello world' = 3
                System.out.println("Occurrence of '" + ch + "' in '" + sentence + "' = " + count);
            } else { //'a' is not present
                System.out.println("'"+ch+"' is not present");
            }
        }

    }
}
