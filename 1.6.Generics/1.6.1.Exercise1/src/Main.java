import Classes.NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods<String> inst1 = new NoGenericMethods<>("Hello","World","!");
        NoGenericMethods<String> inst2 = new NoGenericMethods<>("!","Hello","World");
        NoGenericMethods<String> inst3 = new NoGenericMethods<>("World","!","Hello");
        NoGenericMethods<String> inst4 = new NoGenericMethods<>("Hello","!","World");

        System.out.println("First instance: " + inst1 +
                "\n Second instance: " + inst2 +
                "\n Third instance: " + inst3);

        inst1.setObj3("Uh");
        System.out.println("First instance after change Obj3: " + inst1);
    }
}