package Controller;
import Classes.*;
import Exceptions.EmptySaleException;

public class MainController {

    public static void start(){
        Sale sale = new Sale();
        checkSale(sale);
        updateSale(sale);1
        checkSale(sale);
        checkList(new int[1]);
    }
    private static Sale createSale(){
        return new Sale();
    }

    private static void updateSale(Sale sale){
        sale.addProduct(new Product("Chair", 25.00));
        sale.addProduct(new Product("Table", 50.99));
    }

    private static void checkSale(Sale sale){
        try {
            sale.calculateTotal();
        } catch(EmptySaleException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkList(int[] numbers){
        try {
            int number = numbers[3];
        } catch(IndexOutOfBoundsException e){
            System.out.println("Error: IndexOutOfBounds Exception ->" + e.getMessage());
        }
    }
}
