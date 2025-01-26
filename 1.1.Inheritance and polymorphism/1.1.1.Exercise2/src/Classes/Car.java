package Classes;
public class Car {

    public final static String brand = "Nissan";
    public String model;
    public int power;

    public Car (int power,String model){
        this.power = power;
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower(){
        return this.power;
    }

    public static void brake(){
        System.out.println("The vehicle is braking");
    }

    public void accelerate(){
        System.out.println("The vehicle is accelerating");
    }

}
