package corejava.superandthiskeyword;

public class ChildDemo extends ParentDemo {
    String name="Child Class Text";

    public ChildDemo()
    {
        super(); //to use parent constructor in Child class it should be the first line
        System.out.println("Child Class Constructor");
    }
    public static void main(String[] args) {

        ChildDemo cd= new ChildDemo();
        cd.getNames();
        cd.getData();

    }

    public void getNames()
    {
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData(){
        System.out.println("I am a child class Method");
        super.getData();
    }
}
