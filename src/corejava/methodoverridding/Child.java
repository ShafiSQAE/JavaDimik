package corejava.methodoverridding;

public class Child extends Parent {

    public static void main(String[] args) {
        Child child=new Child();
        child.printName();
        child.printPhoneNumber("90083243242");
        child.printAddress("Berlin, Germany");

    }

    public void printName(){
        System.out.println("Mr. Child");
    }

    public void printAddress(String address){
        System.out.println(address);
    }

}
