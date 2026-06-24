import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OddTest {
    Odd e;
    @Before
    public void setUp() {
        e = new Odd();
        System.out.println("Setup Method Executed");
    }
    @After
    public void tearDown() {
        System.out.println("Teardown Method Executed");
    }
    @Test
    public void testAdd() {
        int a = 8;
        boolean result = e.isOdd(a);
        assertEquals(true, result);
    }
}