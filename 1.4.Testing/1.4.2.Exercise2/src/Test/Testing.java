package Test;
import Classes.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Testing {

    @Test
    public void isTheSame(){

        Computer c1 = new Computer("Alienware", 1999.99);
        Computer c2 = c1;

        assertThat(c1).isSameAs(c2);
    }

    @Test
    public void isNotTheSame(){
        Computer c1 = new Computer("Alienware", 1999.99);
        Computer c3 = new Computer("MSI", 1500.99);

        assertThat(c1).isNotSameAs(c3);
    }

}
