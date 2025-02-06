import Classes.NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods p1 = new NoGenericMethods("Ana","Martín","Female");
        NoGenericMethods p2 = new NoGenericMethods("Antonio","Vázquez","Male");
        NoGenericMethods p3 = new NoGenericMethods("Laura","Vasco","Female");

        System.out.printf("First person: %s\n Second person: %s\n Third person: %s%n",
                p1, p2, p3);

        p1.setLastName("German");
        System.out.printf("First person after changes her last name: %s%n", p1);
    }
}