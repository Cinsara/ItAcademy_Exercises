package Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testing {

    @Test
    public void compareArray(){

        int[] n1 = new int[] {1,2,3,4,5};
        int[] n2 = new int[] {1,2,3,4,5};

        assertArrayEquals(n1,n2,"The arrays are the same.");

    }

}
