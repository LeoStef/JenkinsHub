import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

class SimpleTest2 {
    Simple simple;
    @Before
    public void setUp() {
        simple = new Simple();
    }

    @Test
    public void base64() {
        String result2 = simple.base64("encodeMe");
        String expected2 = "ZW5jb2RlTWU=";
        assertEquals(expected2,result2);

    }
}