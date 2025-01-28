import static Classes.Entry.*;

public class Main {
    public static void main(String[] args) {

        byte age = readByte("Insert your age: ");
        int numInt = readInt("Write an integer: ");
        float price = readFloat("Insert a decimal price: ");
        double distance = readDouble("Insert distance in a decimal number: ");
        char letter = readChar("Write a single letter: ");
        String name = readString("Write yor name: ");
        boolean answer = readYesOrNot("¿Do you like music? Write 'y' (yes) or 'n' (not): ");

        System.out.println("All data:" +
                "\n Age: " + age +
                "\n Integer: " + numInt +
                "\n Price: " + price +
                "\n Distance: " + distance +
                "\n Letter: " + letter +
                "\n Name: " + name +
                "\n Answer: " + answer);
    }
}