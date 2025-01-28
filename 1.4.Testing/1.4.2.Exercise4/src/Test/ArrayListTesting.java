package Test;
import Classes.Computer;
import Classes.Smartphone;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListTesting {

    @Test
    public void verifyOrder(){

        List<Object> objectsArray = new ArrayList<>();

        Computer c1 = new Computer("Mac", 1999);
        Computer c2 = new Computer("Alienware", 1599);
        Smartphone s1 = new Smartphone("Samsung S21", 599.99);

        objectsArray.add(c1);
        objectsArray.add(c2);
        objectsArray.add(s1);

        assertThat(objectsArray).containsExactly(c1,c2,s1);
    }

    @Test
    public void verifyAnyOrder(){
        List<Object> objectsArray = new ArrayList<>();

        Computer c1 = new Computer("Alienware", 1999);
        Computer c2 = new Computer("Mac", 1599);
        Smartphone s1 = new Smartphone("Samsung S21", 599.99);

        objectsArray.add(c1);
        objectsArray.add(c2);
        objectsArray.add(s1);

        assertThat(objectsArray).containsOnly(c1,c2,s1);
    }


    @Test
    public void elementAddedOnce(){
        List<Object> objectsArray = new ArrayList<>();

        Computer c1 = new Computer("Alienware", 1999);
        Computer c2 = new Computer("Mac", 1599);
        Smartphone s1 = new Smartphone("Samsung S21", 599.99);

        objectsArray.add(c1);
        objectsArray.add(c2);

        assertThat(objectsArray).containsOnlyOnce(c1);

    }

    @Test
    public void UnaddedElement(){
        List<Object> objectsArray = new ArrayList<>();

        Computer c1 = new Computer("Alienware", 1999);
        Computer c2 = new Computer("Mac", 1599);
        Smartphone s1 = new Smartphone("Samsung S21", 599.99);

        objectsArray.add(c1);
        objectsArray.add(c2);

        assertThat(objectsArray).doesNotContain(s1);
    }
}
