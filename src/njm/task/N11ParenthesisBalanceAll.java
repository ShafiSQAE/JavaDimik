package njm.task;

import java.util.Scanner;

public class N11ParenthesisBalanceAll {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String input= scanner.nextLine();

        char[] inputArr= input.toCharArray();
        int balance=0;

        for(char ch : inputArr){
            if(ch== '('){
                balance++;
            }
            else if(ch==')'){
                balance--;
            }
        }

        if(balance==0){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}
