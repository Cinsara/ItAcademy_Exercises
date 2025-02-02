import Classes.GenericMethods;
import Classes.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Pepe", "Pérez", 32);

        GenericMethods genericMethods = new GenericMethods();

        genericMethods.print("Hello", 23, p1);
        genericMethods.print(3.53, "Bye", 'E');
        genericMethods.print(p1, 23453, "Lalala");
    }
}