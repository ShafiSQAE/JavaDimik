package corejava.interfaceexample;

public class MalaysianTraffic implements CentralTraffic{

    public static void main(String[] args) {

        CentralTraffic cf=new MalaysianTraffic();
        cf.greenSignal();
        cf.redSignal();
        cf.yellowSignal();
        zebraCrossing();


    }




    @Override
    public void greenSignal() {
        System.out.println("You can go");

    }

    @Override
    public void redSignal() {
        System.out.println("Stop, you can't go");

    }

    @Override
    public void yellowSignal() {
        System.out.println("Slower down and be cautious for red signal");

    }

    public static void zebraCrossing(){
        System.out.println("Walk ony using zebra crossing when the walking signal is green");
    }

}
