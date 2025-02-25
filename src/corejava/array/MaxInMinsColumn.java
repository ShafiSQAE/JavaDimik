package corejava.array;

/* 2 4 5
    3 2 10
    1 2 0
In this matrix find the Biggest number of column which column contains the smallest
number in whole matrix
Answer is: 10 Here

 */
public class MaxInMinsColumn {

    public static void main(String[] args) {
        int num[][]= {
                {2,4,5},
                {3,2,10},
                {1,2,0}};

        int min=num[0][0];
        int minCol=0;

        for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num.length; j++)
            {
                 if(num[i][j]<min)
                 {
                     min=num[i][j];
                     minCol=j;
                 }
            }
        }

        int k=0;
        int max=num[0][minCol];

        while(k<3)
        {
            if(num[k][minCol]>max)
            {
                max=num[k][minCol];
            }
            k++;
        }

        System.out.println(max);
    }
}
