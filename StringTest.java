import org.junit.*;
import static org.junit.Assert.*;

public class StringTest {
    private String testString;

    @Before
    public void setUp() throws Exception {
        testString = "Hello, Bao";
    }

    @Test
    public void testStringLength() {
        assertEquals(10, testString.length());
    }

    @Test
    public void testCharAt() {
        assertEquals('H', testString.charAt(0));
        assertEquals('B', testString.charAt(7));
    }

    @Test
    public void testSubstring() {
        assertEquals("Hello", testString.substring(0, 5));
        assertEquals("Bao", testString.substring(7));
    }

    @Test
    public void testIndexOf() {
        assertEquals(7, testString.indexOf("Bao"));
        assertEquals(-1, testString.indexOf("Java"));
    }
}


