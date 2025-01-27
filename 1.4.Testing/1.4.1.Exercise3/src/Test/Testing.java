package Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    public void testException(){
        int[] numbers = {1,2,3,4,5};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {int element = numbers[5];});

    }
}
