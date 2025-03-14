package simpleproblems;

import java.util.Scanner;

public class Bivajjo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int a = s.nextInt();
        int b = s.nextInt();
        long c = s.nextLong();
        long start = (long) a * b;

        if(start>b){
            result.append("Invalid");
        }

        for (long i = start; i <= c; i += start) {
            result.append(i).append("\n");
        }

        System.out.print(result);
    }
}
