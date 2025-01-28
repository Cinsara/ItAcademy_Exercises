package Test;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestingException {

    @Test
    public void testArrayIndexOutOfBounds(){

        ArrayIndexOutOfBoundsException exception = null;

        try {
            int[] numbers = {1,2,3,4};
            int n1 = numbers[6];
        } catch(ArrayIndexOutOfBoundsException e) {
            exception = e;
        }

        assertThat(exception).isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessageContaining("Index 6");

    }
}
