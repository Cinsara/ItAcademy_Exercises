package org.example.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainController {
    public static void start() {
        List<String> list = new ArrayList<>((Arrays.asList("Hello","World","!")));

        list.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        list.forEach(System.out::println);
    }
}
