import Classes.Restaurant;
import java.util.*;

public class Main {
    static HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("Happy Fish", 10);
        Restaurant r2 = new Restaurant("House knife", 5);
        Restaurant r3 = new Restaurant("Air Food", 9);

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);

        System.out.println("The restaurants in descendant order:");

        List<Restaurant> restaurantList = new ArrayList<Restaurant>(restaurants);
        restaurantList.sort(Comparator.comparing(Restaurant :: getName, Comparator.reverseOrder())
                .thenComparing(Restaurant :: getScore, Comparator.reverseOrder()));

        restaurantList.forEach(System.out::println);

    }
}