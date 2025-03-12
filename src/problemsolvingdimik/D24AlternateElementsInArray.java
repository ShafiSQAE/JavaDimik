package problemsolvingdimik;

import java.util.Scanner;

public class D24AlternateElementsInArray {

    public static void main(String[] args) {

    Scanner s= new Scanner(System.in);
    int t=s.nextInt();

    for(int test=0; test<t; test++)
    {
        int n=s.nextInt();
        int[] numbers= new int[n];

        for(int i=0; i<n; i++)
        {
            numbers[i]=s.nextInt();
        }

        for(int j=0; j<n; j=j+2)
        {
            if(j>0) System.out.print(" ");
            System.out.print(numbers[j]);
        }
        System.out.println();
    }

    }
}
