package problemsolvingdimik;

import java.util.Scanner;

public class D19CountingWordBySpace {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();
        scanner.nextLine();

        for(int test=0; test<t; test++) {

            String sen = scanner.nextLine();
            char[] senArray = sen.toCharArray();

            int count = 0;
            for (char ch : senArray) {
                if (ch == ' ') {
                    count++;
                }
            }

            System.out.println("Count = " + (count + 1));
        }
    }
}
