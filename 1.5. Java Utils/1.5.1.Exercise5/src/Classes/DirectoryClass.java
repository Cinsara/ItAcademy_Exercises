package Classes;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class DirectoryClass {

    public static void serializeObjectJava(){

        Scanner input = new Scanner(System.in);
        System.out.println("Write the text you want to serialize: ");
        String textToSerialize = input.nextLine();

        System.out.println("Enter the name of the file to save the serialized object (for example, 'object.ser')");
        String filePath = input.nextLine();

        try(ObjectOutputStream object1 = new ObjectOutputStream(new FileOutputStream(filePath))){
            object1.writeObject(textToSerialize);
            System.out.println("The object has been serialized.");
        } catch(IOException e){
            System.err.printf("Something is wrong: %s%n", e.getMessage());
        }
    }

    public static Object deserializableObjectJava(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the file to deserialize (for example, 'object.ser'):");
        String filePath = input.nextLine();

        Object object = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){
            object = objectInputStream.readObject();
            System.out.println("The object has been deserialized.");
        } catch(IOException | ClassNotFoundException e){
            System.err.printf("Something is wrong: %s%n", e.getMessage());
        }
        return object;
    }
}