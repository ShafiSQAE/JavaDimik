package corejava.inheritace;

public class Audi extends Vehicles{

    public static void main(String[] args) {

        Vehicles vehicles= new Vehicles();
        vehicles.honk();
        vehicles.body();
        vehicles.fuel();

        Audi audi=new Audi();
        audi.audiColor();
        audi.audiHonk();

    }

    public void audiColor(){
        System.out.println(color);
        System.out.println("Audi's color will be red,green and white");
    }

    public void audiHonk(){
        System.out.println("Pa Pa Pi Pi");
    }
}
