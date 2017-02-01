package jackson.rick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rickjackson on 1/31/17.
 */
public class CatTest {
    private Cat cat;

    @Before
    public void setUp() throws Exception {
        cat = new Cat("Catdog");
    }

    @Test
    public void speakTest() throws Exception {
        String expected = "Meow!";
        String actual = cat.speak();
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}