import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SimpleTest {
    Simple simple;

    @Before
    void setUp() {

        simple = new Simple();
    }

    @Test
    void square() {
        int result = simple.square(11);
        int expected = 121;
        assertEquals(expected,result);

    }

    @Test
    void base64() {
        String result2 = simple.base64("encodeMe");
        String expected2 = "ZW5jb2RlTWU=";
        assertEquals(expected2,result2);
    }
}
