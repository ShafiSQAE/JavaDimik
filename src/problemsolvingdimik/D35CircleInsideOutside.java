package problemsolvingdimik;

import java.util.Scanner;

public class D35CircleInsideOutside {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            int pointX = scanner.nextInt();
            int pointY = scanner.nextInt();
            int r = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int distanceSquare = (pointX - X) * (pointX - X) + (pointY - Y) * (pointY - Y);
            int radiusSquare = r * r;

            if (distanceSquare < radiusSquare) {
                System.out.println("The point is inside the circle");
            } else System.out.println("The point is not inside the circle");
        }
    }
}
