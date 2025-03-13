package simpleproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        int n=scanner.nextInt();
        Integer[] numbers= new Integer[n];
        for(int i=0; i<n; i++)
        {
            numbers[i]=scanner.nextInt();
        }

        List<Integer> numbersList= Arrays.asList(numbers);

       List<Integer> sortedNumbers= numbersList.stream().sorted().collect(Collectors.toList());

       if(numbersList.equals(sortedNumbers))
       {
           System.out.println("Yes");
       }
       else {
           System.out.println("No");
       }
    }
}
