package njm;

public class NajimsExercise01 {

    public static void main(String[] args) {

        System.out.println(sum(5,10));
        printStar(5);
        printSpace(5);
        printStar(5);

        System.out.println();
        printChar(5, "*");
        printChar(5, " ");
        printChar(5, "*");

    }

    private static int sum(int a, int b) {
        return a+b;
    }

    private static void printStar(int n){

        for(int i=0; i<n; i++){
            System.out.print("*");
        }
    }

    private static void printSpace(int n){

        for(int i=0; i<n; i++){
            System.out.print(" ");
        }
    }

    private static void printChar(int n, String ch){

        for(int i=0; i<n; i++){
            System.out.print(ch);
        }
    }
}
