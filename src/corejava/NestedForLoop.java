package corejava;

/* 1 2 3 4
    1 2 3
    1 2
    1
 */

public class NestedForLoop {

    public static void main(String[] args) {
        for(int i=4; i>=0; i--)
        {
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
                //System.out.print(" ");
            }
            System.out.print("\n");
        }

        System.out.println("---------------------------");

        for(int k=1; k<=4; k++)
        {
            for(int l=1; l<=k; l++)
            {
                System.out.print(l);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
