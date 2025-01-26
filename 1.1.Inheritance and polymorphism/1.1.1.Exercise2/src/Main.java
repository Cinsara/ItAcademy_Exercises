import Classes.*;
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(150, "Evalia");

        System.out.println("Test drive the car of the brand " + Car.brand
               + " and model " + car1.model + ".");

        car1.accelerate();
        Car.brake();


    }
}