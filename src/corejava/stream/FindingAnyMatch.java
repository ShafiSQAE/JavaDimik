package corejava.stream;

import java.util.ArrayList;
import java.util.List;

public class FindingAnyMatch {

    public static void main(String[] args) {

        List<String> countries= new ArrayList<>();
        countries.add("Bangladesh");
        countries.add("Nepal");
        countries.add("America");
        countries.add("Zibuti");

        Boolean flag= countries.stream().anyMatch(s -> s.equalsIgnoreCase("Nepal"));
        System.out.println(flag);
    }
}
