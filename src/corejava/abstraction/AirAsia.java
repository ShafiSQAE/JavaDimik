package corejava.abstraction;

public class AirAsia extends AeroPlaneDirections{


    public static void main(String[] args) {

        AeroPlaneDirections apd= new AirAsia();
        apd.cockpitArrangement();
        apd.engineMechanism();
        apd.logoColour();

    }
    @Override
    public void logoColour() {
        System.out.println("Logo can be airliner specific");

    }
}
