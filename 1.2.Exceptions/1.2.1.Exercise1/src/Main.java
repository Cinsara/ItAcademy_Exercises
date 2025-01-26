public class Main {
    public static void main(String[] args) throws EmptySaleException {

       Sale sale1 = new Sale();
       int[] numbers = new int[1];

       try {
           sale1.calculateTotal();
       } catch(EmptySaleException e){
           System.out.println(e.getMessage());
       }

       sale1.addProduct(new Product("Chair", 25.00));
       sale1.addProduct(new Product("Table", 50.99));

       try{
           sale1.calculateTotal();
       } catch(EmptySaleException e){
           System.out.println(e.getMessage());
       }

       try {
           int number = numbers[3];
       } catch(IndexOutOfBoundsException e){
           System.out.println("Error: IndexOutOfBounds Exception ->" + e.getMessage());
       }

    }


}