package Classes;

public class GenericMethods {

    public <T, U, V> void print(T arg1, U arg2, V arg3) {
        System.out.println("Argument 1: " + arg1 +
                "\n Argument 2: " + arg2 +
                "\n Argument 3: " + arg3);
    }
}

