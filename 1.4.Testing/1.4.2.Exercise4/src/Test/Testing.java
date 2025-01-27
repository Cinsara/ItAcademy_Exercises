package Test;
import Classes.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    public void verifyOrder(){

        List<Object> objectsArray = new ArrayList<>();
        String[] nameObjects = new String[]{"Mac","Alienware","Samsung S21"};

        Computer c1 = new Computer("Mac", 1999);
        Computer c2 = new Computer("Alienware", 1599);
        Smartphone s1 = new Smartphone("Samsung S21", 599.99);

        objectsArray.add(c1);
        objectsArray.add(c2);
        objectsArray.add(s1);

        for(int i = 0; i < objectsArray.size(); i++){
            Object obj = objectsArray.get(i);
            String name = "";

            if(obj instanceof Computer){
                name = ((Computer) obj).getName();
            } else if (obj instanceof Smartphone) {
                name = ((Smartphone) obj).getName();
            }
            assertEquals(nameObjects[i],name);
        }
    }

    @Test
    public void verifyAnyOrder(){
        List<Object> objectsArray = new ArrayList<>();
        String[] nameObjects = new String[]{"Mac","Alienware","Samsung S21"};

        Computer c1 = new Computer("Alienware", 1999);
        Computer c2 = new Computer("Mac", 1599);
        Smartphone s1 = new Smartphone("Samsung S21", 599.99);

        objectsArray.add(c1);
        objectsArray.add(c2);
        objectsArray.add(s1);

        for(int i = 0; i < nameObjects.length; i++){
            boolean exists = false;
            String n1 = nameObjects[i];

            for(int j = 0; j < objectsArray.size(); j++ ){
                String name = "";
                Object obj = objectsArray.get(j);

                if(obj instanceof Computer){
                    name = ((Computer) obj).getName();
                } else if (obj instanceof Smartphone) {
                    name = ((Smartphone) obj).getName();
                }

                if(name.equalsIgnoreCase(n1)){
                    exists = true;
                }
            }
            assertTrue(exists);
        }
    }

    @Test
    public void addOneTime(){
        List<Object> objectsArray = new ArrayList<>();
        String[] nameObjects = new String[]{"Mac","Alienware"};

        Computer c1 = new Computer("Alienware", 1999);
        Computer c2 = new Computer("Mac", 1599);
        Smartphone s1 = new Smartphone("Samsung S21", 599.99);

        objectsArray.add(c1);
        objectsArray.add(c2);

        for(int i = 0; i < nameObjects.length; i++){
            int counter = 0;
            String n1 = nameObjects[i];

            for(int j = 0; j < objectsArray.size(); j++ ){
                String name = "";
                Object obj = objectsArray.get(j);

                if(obj instanceof Computer){
                    name = ((Computer) obj).getName();
                } else if (obj instanceof Smartphone) {
                    name = ((Smartphone) obj).getName();
                }

                if(name.equalsIgnoreCase(n1)){
                    counter++;
                }
            }
            assertEquals(1, counter);
        }
    }
}
