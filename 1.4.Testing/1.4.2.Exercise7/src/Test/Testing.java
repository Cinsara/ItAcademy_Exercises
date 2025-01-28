package Test;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Optional;

public class Testing {

    @Test
    public void optionalTest(){
        Optional<String> op1 = Optional.empty();
        assertThat(op1).isEmpty();
    }
}
