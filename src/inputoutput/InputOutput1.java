package inputoutput;

import java.util.Scanner;

public class InputOutput1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");

        String text= scanner.nextLine();

        System.out.println("The input text is: "+text);

    }
}
