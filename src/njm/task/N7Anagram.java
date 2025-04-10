package njm.task;

import java.util.Arrays;
import java.util.Scanner;

public class N7Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine().toLowerCase().replaceAll("\\s+","");
        String str2 = scanner.nextLine().toLowerCase().replaceAll("\\s+","");

        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();


        Arrays.sort(strArr1);
        Arrays.sort(strArr2);


        if (Arrays.equals(strArr1,strArr2)) {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}
