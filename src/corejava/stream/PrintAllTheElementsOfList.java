package corejava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAllTheElementsOfList {

    public static void main(String[] args) {

        List<String> names= new ArrayList<>();

        names.add("Allu");
        names.add("Sallu");
        names.add("Dhrub");
        names.add("Mannu");
        names.add("Arzu");

        names.stream().forEach(s-> System.out.println(s));
        System.out.println("====================");

        names.stream().filter(s->s.contains("M")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
        System.out.println("==================");

        names.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
        System.out.println("========= Print only one result============");
        names.stream().filter(s->s.length()>4).limit(1).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        List<Integer> numbers2= Arrays.asList(7, 8, 9 , 2, 4, 5, 1, 9);

        System.out.println("================= Ascending Sorting============");

        numbers2.stream().sorted().forEach(s-> System.out.print(s+" "));
        System.out.println();
        System.out.println("================== Descending Sorting=============== ");
        numbers2.stream().sorted((a, b) -> b.compareTo(a)).forEach(s-> System.out.print(s+" "));

    }
}
