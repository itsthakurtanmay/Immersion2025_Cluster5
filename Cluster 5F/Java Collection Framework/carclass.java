
class Car {

    String carname;
    String model;
    boolean automatic;
    String color;
    int price;
    float milage;
    int speed;
    boolean fourbyfour;

    public void acceletor(int accelerateSpeed) {

    }
    int doors;

    //constructor;
    Car(String carname, String model, boolean auto, String color, int p, float milage) {
        this.carname = carname;
        this.model = model;
        this.automatic = auto;
        this.color = color;
        this.price = p;
        this.milage = milage;
        this.speed = 0;
    }

}

public class carclass {

    public static void main(String[] args) {
        Car vehical = new Car("Scorpio", "s11", false, "Black", 200000, 12.09f);
        System.out.println(vehical.carname);

    }
}
