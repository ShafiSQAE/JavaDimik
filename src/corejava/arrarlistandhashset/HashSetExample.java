package corejava.arrarlistandhashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> fruits= new HashSet<String>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Apple"); //HashSet doesn't allow duplication like ArrayList
        fruits.remove("Banana");
        fruits.add("Longan"); //Like Arraylist we can't add element using index numbere

        System.out.println(fruits);
        System.out.println("---------Printing Element using For each loop---------");

        for(String i : fruits)
        {
            System.out.println(i);
        }

        System.out.println("=======Printing Elements using Iterator==========");

        Iterator<String> iterator = fruits.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
