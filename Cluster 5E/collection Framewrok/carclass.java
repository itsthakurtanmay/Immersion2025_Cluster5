
class Car {

    String name;
    String color;
    boolean automatic;
    String model;

    //constructor;
    Car(String name, String color, boolean auto, String mod){
        this.name = name;
        this.color = color;
        this.automatic = auto;
        this.model = mod;

    }
}

public class carclass {

    public static void main(String[] args) {
        //object;
        Car Vehical = new Car("audi","red",true,"Q8");
        // Vehical.name = "audi";
        // Vehical.color = "red";
        // Vehical.automatic = true;
        // Vehical.model = "R8";

        System.out.println(Vehical.model);

    }
}
