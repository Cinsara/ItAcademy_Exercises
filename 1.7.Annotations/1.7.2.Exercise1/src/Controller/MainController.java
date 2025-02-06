package Controller;

import Classes.*;
import java.io.IOException;

public class MainController {

    public static void start() {
        Person p1 = new Person("Juan","Pérez", 22);

        try {
            JsonSerializer.serialize(p1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
