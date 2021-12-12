import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.script.SimpleScriptContext;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTest2 {
    Simple simple;
    @BeforeEach
    void setUp() {
        simple = new Simple();
    }

    @Test
    void base64() {
        String result2 = simple.base64("encodeMe");
        String expected2 = "ZW5jb2RlTWU=";
        assertEquals(expected2,result2);
    }
}