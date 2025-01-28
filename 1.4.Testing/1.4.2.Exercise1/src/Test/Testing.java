package Test;
import Classes.NumberObject;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Testing {

    @Test
    public void equals(){
        NumberObject n1 = new NumberObject(3);
        NumberObject n2 = new NumberObject(3);

        assertThat(n1).isEqualTo(n2);
    }

    @Test
    public void notEquals(){
        NumberObject n1 = new NumberObject(3);
        NumberObject n2 = new NumberObject(2);

        assertThat(n1).isNotEqualTo(n2);
    }
}
