package Test;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Testing {

    @Test
    public void compareArray(){

        int[] n1 = new int[] {1,2,3,4,5};
        int[] n2 = new int[] {1,2,3,4,5};

        assertThat(n1).isEqualTo(n2);
    }
}
