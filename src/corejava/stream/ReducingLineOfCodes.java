package corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReducingLineOfCodes {

    public static void main(String[] args) {

        List<String> names= new ArrayList<>();

        names.add("Arnav");
        names.add("Abhiseskh");
        names.add("Boby");
        names.add("Atul");
        names.add("Sinu");
        int count=0;

        for(int i=0; i<names.size(); i++)
        {
            //System.out.println(names.get(i));
            if(names.get(i).startsWith("A"))
            {
                System.out.println(names.get(i));
                count++;
            }
        }
        System.out.println("Number of names start with A is: "+count);
        System.out.println("================With he help of java stream===============");

        names.stream().filter(s->s.startsWith("A")).forEach(s -> System.out.println(s));

        long c= names.stream().filter(s->s.startsWith("A")).count();
        //1. first create stream by names.stream()
        //2. Perform an intermediate operation on that stream : .filter(s->s) this will create a new stream
        //3. finally perform terminal operation to get final result : .count()

        System.out.println("Number of names start with A is: "+c+" (Counted by Stream)");

        //Printing all the name of a list is so short code with stream
        names.stream().forEach(s-> System.out.println(s));
    }
}
