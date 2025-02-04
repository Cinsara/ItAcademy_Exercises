package org.example.Classes;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Interfaces.JsonSerializable;

import java.io.File;
import java.io.IOException;

public class JsonSerializer {
    public static <T> void serialize(T object) throws IOException {
        Class<T> class1 = (Class<T>) object.getClass();

        if (class1.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = class1.getAnnotation(JsonSerializable.class);
            String filePath = annotation.directory().replace("\\", "/");

            File file = new File(filePath);
            File parentDir = file.getParentFile();

            if (parentDir != null && !parentDir.exists()) {
                parentDir.mkdirs();
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(file, object);

            System.out.println("Object serialized and saved to: " + filePath);
        } else {
            throw new RuntimeException("The class doesn't have the annotation @JsonSerializable");
        }
    }
}
