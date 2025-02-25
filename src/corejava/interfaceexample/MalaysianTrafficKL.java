package corejava.interfaceexample;

public class MalaysianTrafficKL implements CentralTraffic,AsianTraffic{

    //You can implement multiple interfaces separating by ,

    public static void main(String[] args) {

        CentralTraffic ct=new MalaysianTrafficKL(); //to use methods of CentralTraffic interface you need to create object
        ct.greenSignal();
        ct.redSignal();
        ct.yellowSignal();

        AsianTraffic af= new MalaysianTrafficKL(); //to use methods of AsianTraffic interface you need to create object
        af.noHorn();

        zebraCrossing(); //this is a static method of MalaysianTrafficKL class, so no need to create object. You can directly call that method

        MalaysianTrafficKL mt= new MalaysianTrafficKL();
        mt.metroStation(); // this is not a static method, so need to create object first.



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

    @Override
    public void noHorn() {
        System.out.println("On specific road signs you can't honk, like: Hospital,School etc");
    }

    public static void zebraCrossing(){ //because of static method you don't need to create an object of this class (see above)
        System.out.println("Walk ony using zebra crossing when the walking signal is green");
    }

    public void metroStation(){ //This is not a static method, so you need to create an object to use this method (see above)
        System.out.println("All metro stations do NOT have parking");
    }
}
