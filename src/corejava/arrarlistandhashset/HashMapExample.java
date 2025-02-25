package corejava.arrarlistandhashset;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, String> cities= new HashMap<String, String>();

        cities.put("Bangladesh","Dhaka");
        cities.put("England","London");
        cities.put("Bhutan","Thimphu");

        System.out.println("----------Printing Key Value Pairs----------");

        Iterator  it=cities.entrySet().iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("----------Printing Keys----------");

        Iterator it2=cities.keySet().iterator();
        while (it2.hasNext())
        {
            System.out.println(it2.next());
        }

        System.out.println("----------Printing Values----------");

        Iterator it3= cities.values().iterator();
        while (it3.hasNext())
        {
            System.out.println(it3.next());
        }
    }
}
