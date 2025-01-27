package Test;
import Classes.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    public void isTheSame(){

        Computer c1 = new Computer("Alienware", 1999.99);
        Computer c2 = c1;
        Computer c3 = new Computer("MSI", 1500.99);

        assertSame(c1,c2,"Are the same.");
    }

    @Test
    public void isNotTheSame(){
        Computer c1 = new Computer("Alienware", 1999.99);
        Computer c3 = new Computer("MSI", 1500.99);

        assertNotSame(c1,c3,"Are not the same.");
    }

}
