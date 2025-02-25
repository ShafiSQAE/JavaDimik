package corejava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAList {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Dahak", "Augsburg", "Calkata", "BricksField");

        cities.stream().sorted().forEach(s-> System.out.println(s));

        List<String> countries= new ArrayList<>();
        countries.add("Bangladesh");
        countries.add("Nepal");
        countries.add("America");
        countries.add("Zibuti");

        System.out.println("============Descending sorting==========");

        countries.stream().sorted((a,b) -> b.compareTo(a)).forEach(s-> System.out.println(s));
    }

}
