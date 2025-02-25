package corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConcateTwoStreams {

    public static void main(String[] args) {

        List<String> names1= new ArrayList<>();

        names1.add("Name11");
        names1.add("Name12");
        names1.add("Name13");

        List<String> names2= new ArrayList<>();
        names2.add("Name21");
        names2.add("Name22");
        names2.add("Name23");


        Stream<String> newStream = Stream.concat(names1.stream(),names2.stream());
        newStream.forEach(s-> System.out.print(s+" "));
        System.out.println();
        //or
        Stream.concat(names1.stream(),names2.stream()).forEach(s-> System.out.print(s+" "));
        System.out.println();
        Stream.concat(names2.stream(),names1.stream()).sorted().forEach(s-> System.out.print(s+" "));
    }
}
