package Classes;
import Interfaces.*;
public class Smartphone extends Phone implements Watch, Camera {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

}



