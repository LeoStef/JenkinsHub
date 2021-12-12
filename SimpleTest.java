import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class SimpleTest {
    Simple simple;

    @Before
    public void setUp() {

        simple = new Simple();
    }

    @Test
    public void square() {
        int result = simple.square(11);
        int expected = 121;
        assertEquals(expected,result);
        System.out.println("Success!");
    }


}
