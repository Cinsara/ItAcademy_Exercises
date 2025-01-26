import java.util.ArrayList;

public class Sale {

    private ArrayList<Product> products;
    private double totalPrice;

    public Sale(){
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public void calculateTotal() throws EmptySaleException {

        if(products.isEmpty()){
            throw new EmptySaleException("To make a sale, you must add products first");
        }

        totalPrice = 0.00;

        for(Product product : products){
            totalPrice += product.getPrice();
        }
        System.out.println("Total price of the sale: " + totalPrice + "$");

    }

    public void addProduct(Product product){
        products.add(product);
    }

}
