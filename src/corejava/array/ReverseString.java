package corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input= scanner.nextLine();
        char[] inputArr= input.toCharArray();

        int left=0;
        int right=inputArr.length-1;

        while(left<right){
            char temp=inputArr[left];
            inputArr[left]=inputArr[right];
            inputArr[right]=temp;
            left++;
            right--;
        }

        String reversed= new String(inputArr);
        System.out.println(reversed);

//        for(int k=0; k<inputArr.length; k++){
//            System.out.print(inputArr[k]);
//        }
    }
}
