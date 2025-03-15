package problemsolvingdimik;

import java.util.Scanner;

public class D43SumOfSeries3WithStringBuilder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int test=0; test<t; test++){
            int k=scanner.nextInt();
            StringBuilder result=new StringBuilder();

            if(k==0){
                result.append("1");
            }
            else if(k==1){
                result.append("2 + 1");
            }
            else
            {
                for(int i=k; i>1; i--){
                    result.append("2^").append(i).append(" + ");
                }
                result.append("2 + 1");
            }
            System.out.println(result);
        }
    }
}
