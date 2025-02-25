package corejava.array;

public class FindSmallestNumber {

    public static void main(String[] args) {

        int num[][]=
                {{2,4,9},
                {3,4,7},
                {7,2,0}};
        int small=num[0][0];

        for(int i=0; i< num.length; i++)
        {
            for(int j=0; j<num.length; j++)
            {
                if (num[i][j]<small)
                {
                    small=num[i][j];
                }
            }
        }
        System.out.println("The smallest number in the array is: "+small);
    }

}
