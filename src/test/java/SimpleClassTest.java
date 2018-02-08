import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleClassTest {

    @Test
    public void returnThis() {
        assertTrue(new SimpleClass().returnThis("1").equals("1"));
    }
}