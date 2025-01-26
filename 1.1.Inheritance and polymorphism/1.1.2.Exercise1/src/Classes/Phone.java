package Classes;
public class Phone {

    protected String brand = "";
    protected String model = "";

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void calling(String numberPhone) {
        System.out.println("The number calling is "+ numberPhone);
    }

}
