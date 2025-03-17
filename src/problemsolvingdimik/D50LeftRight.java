package problemsolvingdimik;

import java.util.Scanner;

public class D50LeftRight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int test = 0; test < t; test++) {

            String st = scanner.nextLine();
            char[] st2 = st.toCharArray();


            for (int i = 0; i < st2.length; i++) {
                if (st2[i] == 'L') {
                    st2[i] = st2[i - 1];
                } else if (st2[i] == 'R') {
                    st2[i] = st2[i + 1];
                }
            }

            System.out.println(st2);

        }
    }
}
