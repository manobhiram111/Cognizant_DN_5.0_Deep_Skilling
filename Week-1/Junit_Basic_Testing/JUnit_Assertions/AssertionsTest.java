import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {
@Test
    public void testAssertions() {
        assertTrue(5 > 3);
        assertEquals(5, 2 + 3);
        assertNull(null);
        assertFalse(5 < 3);
        assertNotNull(new Object());
    }
}