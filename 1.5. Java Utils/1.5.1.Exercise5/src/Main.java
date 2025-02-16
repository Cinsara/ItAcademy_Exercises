import static Classes.DirectoryClass.deserializableObjectJava;
import static Classes.DirectoryClass.serializeObjectJava;

public class Main {
    public static void main(String[] args) {
        serializeObjectJava();

        String deserializedText = (String) deserializableObjectJava();
        System.out.printf("Deserialized text: %s%n", deserializedText);
    }
}