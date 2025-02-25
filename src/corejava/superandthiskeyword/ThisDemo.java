package corejava.superandthiskeyword;

public class ThisDemo {

    int a=5;

    public void printNumber(){
        int a=3;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println("The some of local and Global Variables is: "+(a+this.a));
    }

    public static void main(String[] args) {
        ThisDemo td=new ThisDemo();
        td.printNumber();
    }
}
