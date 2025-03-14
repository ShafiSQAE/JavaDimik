package simpleproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int input= n;
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);

        int sum=0;
        for(int i=0; i<divisors.size()-1; i++)
        {
            sum=sum+divisors.get(i);
        }
        if(sum==input)
        {
            System.out.println("YES, "+input+" is a perfect number!");
        }
        else System.out.println("NO, "+input+" is not a perfect number!");

    }
}
