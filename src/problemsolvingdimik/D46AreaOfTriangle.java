package problemsolvingdimik;

import java.util.Scanner;

public class D46AreaOfTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            double s = (a + b + c) / 2.0;
            double area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));

            System.out.printf("Area = %.3f\n", area);
        }
    }
}
