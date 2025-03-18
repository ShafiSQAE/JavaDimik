package problemsolvingdimik;

import java.util.Scanner;

public class D51SearchTheKhoj1WithJavaFunction {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        for(int test=0; test<t; test++){

            String input=scanner.nextLine();
            String[] inputStrings= input.split(" ",2);

            String mainString= inputStrings[0];
            String subString= inputStrings[1];

            int index= mainString.indexOf(subString);
            System.out.println(index);
        }
    }
}
