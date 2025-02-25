package problemsolvingdimik;

public class D3NumbersDescending {

    public static void main(String[] args) {

        int count=0;

        for(int i=1000; i>=1; i--)
        {
            count++;
            System.out.print(i+"\t");

            if(count%5==0)
            {
                System.out.println();
            }
        }

    }
}
