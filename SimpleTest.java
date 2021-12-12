import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    Simple simple;

    @BeforeEach
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
