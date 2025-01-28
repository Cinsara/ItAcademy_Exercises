import Classes.Restaurant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Main {
    static HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("Happy Fish", 10);
        Restaurant r2 = new Restaurant("House knife", 5);
        Restaurant r3 = new Restaurant("Happy Fish", 10);

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);

        if(restaurants.add(r1) || restaurants.add(r2) || restaurants.add(r3)){
            System.out.println("New restaurant added.");

        } else {
            System.out.println("There's a restaurant already with that name and score.");
        }

        for(Restaurant restaurant : restaurants){
            System.out.println(restaurant);
        }
    }
}