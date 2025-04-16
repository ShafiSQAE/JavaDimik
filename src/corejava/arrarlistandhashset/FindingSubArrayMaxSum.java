package corejava.arrarlistandhashset;

public class FindingSubArrayMaxSum {

    public static void main(String[] args) {

        int[] numbers={-2, 4, -1, 5};

        int max= Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];

            if(numbers[i]>sum){
                sum=numbers[i];
            }

            if(sum>max){
                max=sum;
            }
        }

        System.out.println(max);

    }
}
