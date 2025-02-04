package org.example;

import org.example.Interfaces.PiCalculator;

public class Main {
    public static void main(String[] args) {
        PiCalculator piCalculator = () -> 3.1415;

        double pi = piCalculator.getPiValue();
        System.out.println("The PI value is: " + pi);
    }
}