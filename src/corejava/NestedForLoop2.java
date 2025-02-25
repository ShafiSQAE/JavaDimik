package corejava;

/* 1 2 3 4
    5 6 7
    8 9
    10
 */

public class NestedForLoop2 {

    static int k=1;

    public static void main(String[] args) {
        for(int i=4; i>0; i--)
        {
            for(int j=1; j<=i; j++){
                System.out.print(k+" ");
                System.out.print("\t");
                k++;
                //System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
