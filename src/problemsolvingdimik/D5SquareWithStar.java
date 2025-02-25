package problemsolvingdimik;

import java.util.Scanner;

public class D5SquareWithStar {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();

        for(int test=0; test<t; test++) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
