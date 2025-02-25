package corejava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAndPrintUniqueNumbers {

    public static void main(String[] args) {


        List<Integer> numbers= Arrays.asList(1, 3, 3, 9, 7, 9, 8, 3, 2, 4, 4, 1, 6, 5, 0);

        numbers.stream().sorted().distinct().forEach(s-> System.out.print(s+" "));
        System.out.println();

        List<Integer> sortedNumbers= numbers.stream().sorted((a,b)-> b.compareTo(a)).distinct().collect(Collectors.toList());
        sortedNumbers.stream().forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println(sortedNumbers.get(2));
    }
}
