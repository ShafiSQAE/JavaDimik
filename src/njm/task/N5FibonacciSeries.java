package njm.task;

import java.util.Scanner;

public class N5FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter How many numbers do you want: ");
        int number=scanner.nextInt();

        showFibonacciSeries(number);
    }

    private static void showFibonacciSeries(int number) {
        if(number<=0){
            System.out.println("Enter a number greater than Zero");
        }
        else if(number==1){
            System.out.println("0");
        }
        else if(number==2){
            System.out.println("0 1");
        }
        else {
            int a=0, b=1;
            System.out.print("The Fibonacci Series is: "+a+" "+b+" ");
            for(int i=2; i<number; i++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
