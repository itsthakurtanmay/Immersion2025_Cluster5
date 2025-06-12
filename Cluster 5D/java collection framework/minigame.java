
class Car {

    String carname;
    String model;
    String color;
    int torque;
    boolean alloy;
    boolean musicsystem;
    int speed;
    boolean fourbyfour;
    boolean sunroof;

    //constructor;
    public Car(String carname, String model, String carcolor, int t, boolean allow, boolean musicSystem, boolean sunroof) {
        this.carname = carname;
        this.model = model;
        this.color = carcolor;
        this.torque = t;
        this.alloy = allow;
        this.musicsystem = musicSystem;
        this.sunroof = sunroof;
        this.speed = 0;

    }

    //move car;
    public void accelerate(int increasedSpeed) {
        speed += increasedSpeed;
        System.out.println(this.carname + " is now running with the speed of " + increasedSpeed + "km/h");
    }

    //horn function
    public void horn() {
        System.out.println("peep peep");
    }

    //break;
    public void breaking() {
        this.speed = 0;

    }
}

public class minigame {

    public static void main(String[] args) {
        //object;
        Car vehical = new Car("Scorpio", "S11", "Black", 45, true, true, false);
        // vehical.carname = "Fortuner";
        // vehical.model = "legender";
        // vehical.color = "white";

        System.out.println(vehical.carname);

        System.out.println(vehical.model);
        System.out.println(vehical.color);
        System.out.println(vehical.torque);
        System.out.println(vehical.sunroof);
        System.out.println(vehical.musicsystem);
        System.out.println(vehical.fourbyfour);

        vehical.accelerate(20);
        vehical.horn();
        vehical.breaking();
        vehical.accelerate(30);
        vehical.accelerate(50);
        vehical.breaking();
    }
}
