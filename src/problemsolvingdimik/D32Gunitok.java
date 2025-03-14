package problemsolvingdimik;

import java.util.Scanner;

public class D32Gunitok {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int t=scanner.nextInt();
        StringBuilder result=new StringBuilder();

        for(int test=0; test<t; test++){
            long x=scanner.nextLong();
            long n=scanner.nextLong();

            if(x>n){
                result.append("Invalid!\n");
            }

            long limit=n/x;
            for(int i=1; i<=limit; i++){
                result.append(i*x).append("\n");
            }
            if(test<t-1){
                result.append("\n");
            }
        }
        System.out.print(result);

    }
}
