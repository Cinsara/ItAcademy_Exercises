public class Product {

    protected static String name = "";
    protected static double price;

    public Product(String name, double price){
        Product.name = name;
        Product.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name, double price){
        Product.name = name;
    }

    public void setPrice(double price){
        Product.price = price;
    }
}
