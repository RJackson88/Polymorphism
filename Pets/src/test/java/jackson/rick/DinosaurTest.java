package jackson.rick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rickjackson on 1/31/17.
 */
public class DinosaurTest {
    private Dinosaur dinosaur;

    @Before
    public void setUp() throws Exception {
        dinosaur = new Dinosaur("");
    }

    @Test
    public void speakTest() throws Exception {
        String expected = "I will eat you!";
        String actual = dinosaur.speak();
        assertEquals(String.format("I expected the result to be: %s", expected), expected, actual);
    }
}
