package njm.task;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] inputArray = input.toCharArray();

        int left = 0;
        int right = inputArray.length - 1;

        while(left<right){
            char temp=inputArray[left];
            inputArray[left]=inputArray[right];
            inputArray[right]=temp;
            left++;
            right--;
        }

        String reversed= new String(inputArray);

        if(input.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
