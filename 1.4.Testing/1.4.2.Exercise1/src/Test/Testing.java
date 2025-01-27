package Test;
import Classes.NumberObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    public void equals(){
        NumberObject n1 = new NumberObject(3);
        NumberObject n2 = new NumberObject(3);

        assertEquals(n1,n2,"The two numbers are equals");
    }

    @Test
    public void notEquals(){
        NumberObject n1 = new NumberObject(3);
        NumberObject n2 = new NumberObject(2);

        assertNotEquals(n1,n2,"The two numbers are not equals");
    }
}
