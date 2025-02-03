package org.example.Classes;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Interfaces.JsonSerializable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonSerializer {
    public static <T> void serialize(T object) throws IOException {
        Class<T> class1 = (Class<T>) object.getClass();

        if(class1.isAnnotationPresent(JsonSerializable.class)){
            JsonSerializable annotation = class1.getAnnotation(JsonSerializable.class);
            String directory = annotation.directory();
            ObjectMapper objectMapper = new ObjectMapper();

            String json = objectMapper.writeValueAsString(object);

            File file = new File(directory + File.separator + class1.getSimpleName());
            objectMapper.writeValue(file,object);

            System.out.println("Object serialized and saved.");

        } else {
            throw new RuntimeException("The class doesn't have the annotation @JsonSerializable");
        }
    }

}
