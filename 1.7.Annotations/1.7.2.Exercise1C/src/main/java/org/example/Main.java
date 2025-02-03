package org.example;

import org.example.Classes.JsonSerializer;
import org.example.Classes.Person;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Person p1 = new Person("Juan","Pérez", 22);

        try {
            JsonSerializer.serialize(p1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}