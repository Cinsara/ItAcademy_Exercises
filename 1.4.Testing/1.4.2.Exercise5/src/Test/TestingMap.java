package Test;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashMap;
import java.util.Map;

public class TestingMap {

    @Test
    public void testKeyMap(){

        Map<String, Integer> m1 = new HashMap<>();
        m1.put("key1", 59);
        m1.put("key2", 100);
        m1.put("key3", 25);

        assertThat(m1).containsKey("key2");
    }
}
