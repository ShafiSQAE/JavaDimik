package problemsolvingdimik;

import java.util.Scanner;

public class D34Bivajjo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result= new StringBuilder();

        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            long c=scanner.nextLong();
            long start= (long) a*b;

            if(start>c){
                continue;
            }


            for(long i=start; i<=c; i+=start){
                result.append(i).append("\n");
            }

            if(test<t-1){
                result.append("\n");
            }
        }
        System.out.print(result);
    }
}
