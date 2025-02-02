package Classes;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise {

    static HashMap<String, String> countries = new HashMap<String,String>();
    static Scanner input = new Scanner(System.in);

    public static void fillHashMap() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("countries.txt"));
        String lines;

        while((lines = br.readLine()) != null){
            String[] countryParts = lines.split(" ");
            if(countryParts.length == 2){
                countries.put(countryParts[0].trim(),countryParts[1].trim());
            }
        }
        br.close();
    }

    public static void randomCountry() throws IOException {

        String username, capitalName;
        int randomNumber;
        int changeNumber = 1;
        int intents = 10;
        List<String> countriesList = new ArrayList<>(countries.keySet());
        List<String> capitalsList = new ArrayList<>(countries.values());

        System.out.println("Please write your username:");
        username = input.nextLine();

        randomNumber = (int) (Math.random() * countries.size());

        System.out.printf("The country is: %s. Now, guess the capital of this country! Please, enter a capital name:%n",
                countriesList.get(randomNumber));

        do {
            capitalName = input.nextLine();

            if (capitalName.equalsIgnoreCase(capitalsList.get(randomNumber))) {
                System.out.println("That's the correct answer!");
                changeNumber = 0;
            } else {
                intents--;
                System.out.printf("Oh no. That's not correct. Please, try again.\nYou have %d more.%n", intents);
            }
        } while (intents > 0 && changeNumber > 0);

        BufferedWriter bw = new BufferedWriter(new FileWriter("classification.txt", true));

        bw.write("%s: %d punts".formatted(username, intents));
        bw.newLine();
        System.out.println("Data saved in classification.txt.");
    }
}
