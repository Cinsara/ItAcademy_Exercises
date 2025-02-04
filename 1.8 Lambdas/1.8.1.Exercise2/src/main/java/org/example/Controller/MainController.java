package org.example.Controller;

import java.util.List;
import java.util.stream.Collectors;

public class MainController {
    static List<String> words = List.of("Hello","World","!","Pomeranian","ItAcademy");

    private static List<String> findO(){

        return words.stream()
                .filter(p -> p.toLowerCase().contains("o"))
                .filter(p -> p.length() > 5)
                .collect(Collectors.toList());
    }

    public static void start(){
        List<String> result = findO();
        System.out.println("Strings with the letter 'o':");
        result.forEach(System.out::println);
    }
}
