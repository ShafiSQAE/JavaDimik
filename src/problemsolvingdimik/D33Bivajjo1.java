package problemsolvingdimik;

import java.util.Scanner;

public class D33Bivajjo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {

            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            long start = (a % c == 0) ? a : a + (c - a % c); //finding the first multiple
            if(start>b){
                continue; //terminate unnecessary computing
            }

            for (long i = start; i <= b; i+=c) {  //loop starts from first multiple, i+=c increments to only multiple of C. Hence reduce a lot of checking
                if (i % c == 0) {
                    result.append(i).append("\n");
                }
            }
            if (test < t - 1) {
                result.append("\n");
            }
        }
        System.out.print(result);
    }
}
