package simpleproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortDigits {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers= new ArrayList<>();

        System.out.println("Enter numbers: ");
        for(int i=0; i<10; i++)
        {
            numbers.add(scanner.nextInt());
            Collections.sort(numbers);
        }

        System.out.println("After Sorting: ");
        for(int j=0; j<numbers.size(); j++)
        {
            System.out.println(numbers.get(j));
        }
    }
}
