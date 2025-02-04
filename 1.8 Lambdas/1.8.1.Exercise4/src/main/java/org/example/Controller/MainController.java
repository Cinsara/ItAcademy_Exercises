package org.example.Controller;

import java.util.List;

public class MainController {

    static List<String> months = List.of(
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
    );

    public static void start(){
        months.stream().forEach(System.out::println);
    }
}
