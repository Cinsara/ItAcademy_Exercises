package org.example;

import org.example.Interfaces.Reversible;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hi world";
        Reversible reversible = string -> new StringBuilder(string).reverse().toString();

        String reversed = reversible.reverse(s1);

        System.out.println("The original sentence: " + s1 +
                "\nThe reversed sentence: " + reversed);
    }
}