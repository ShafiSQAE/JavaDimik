package corejava.arrarlistandhashset;

import java.util.ArrayList;

public class arrayListExample {
    public static void main(String[] args) {


        ArrayList<String> cars= new ArrayList<String>();

        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Toyota");
        cars.add("Proton");
        //cars.add("Honda");
        cars.add(1,"Wolkswagen");
        cars.remove(0);
        cars.set(2,"Nissan (Toyota)");
        cars.add("Ferrari");

        System.out.println(cars);
        System.out.println("-----------------------------");

        for(String i : cars)
        {
            System.out.println(i);
        }

        System.out.println("---------------------------------");

        for(int j=0; j<cars.size(); j++)
        {
            System.out.println(cars.get(j));
        }

        Boolean check= cars.contains("Proton");
        System.out.println("Expected element present in the list: "+check);

        Boolean check2=cars.contains("java");

        System.out.println("Expected element java is present in the List: "+check2);

        int index= cars.indexOf("Ferrari");
        System.out.println("Index of Ferrari is: "+index);

        System.out.println("Array size is: "+cars.size());

        cars.clear();
        System.out.println("All elements cleared");
        System.out.println(cars);
    }
}
