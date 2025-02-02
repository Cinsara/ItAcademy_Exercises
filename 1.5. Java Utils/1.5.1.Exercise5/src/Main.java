import static Classes.DirectoryClass.deserializableObjectJava;
import static Classes.DirectoryClass.serializeObjectJava;

public class Main {
    public static void main(String[] args) {
        String filePath = "object.ser";
        String text = "Hello!";

        serializeObjectJava(text, filePath);

        String deserializedText = (String) deserializableObjectJava(filePath);
        System.out.println("Deserialized text: " + deserializedText);
    }
}